package collect;

public class GroupAnagrams {
    public static void main(String[] args) {
      String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
      System.out.println(repeat(strs));
    }

    public static List<List<String>> repeat(String[] strs){
      HashMap<String, List<String>> map = new HashMap<>();
      for(String str : strs ){
        int[] count = new int[26];
        for(char ch : str.toCharArray()){
          count[ch - 'a']++;
        }

        StringBuilder key = new StringBuilder();
        
        for(int i=0; i<count.length; i++){
          key.append('#');
          key.append(count[i]);
        }

        while(!map.containsKey(key.toString())){
          map.put(key.toString(), new ArrayList());
        }
        map.get(key.toString()).add(str);
      } 
      return new ArrayList<>(map.values());
    }
}