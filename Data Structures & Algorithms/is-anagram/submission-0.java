class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> smap= new HashMap();
        Map<Character,Integer> tmap= new HashMap();

        for (int i = 0; i < s.length();i++){
            char sc = s.charAt(i);
            smap.put(sc,smap.getOrDefault(sc,0)+1);
        }
 for (int i = 0; i < t.length();i++){
  char tc = t.charAt(i);
            tmap.put(tc,tmap.getOrDefault(tc,0)+1);        }

      return smap.equals(tmap);
    }
}
