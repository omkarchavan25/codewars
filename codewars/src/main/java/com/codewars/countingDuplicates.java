import java.util.*;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    Map<String, Integer> map = new HashMap<>();
    int ans =0;
    
    for(int i =0; i<text.length();i++){
      map.merge(Character.toString(text.toLowerCase().charAt(i)),1,Integer::sum);
    }
    
    for(Integer value : map.values()){
      if(value>1) ans++;
    }
    
    return ans;
  }
}
