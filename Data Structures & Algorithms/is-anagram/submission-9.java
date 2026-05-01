class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ele=s.charAt(i);
            if(sMap.containsKey(ele)){
                sMap.put(ele,sMap.get(ele)+1);
            }
            else{
                sMap.put(ele,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ele=t.charAt(i);
            if(tMap.containsKey(ele)){
                tMap.put(ele,tMap.get(ele)+1);
            }
            else{
                tMap.put(ele,1);
            }
        }

        for(char key:sMap.keySet()){
            if(!tMap.containsKey(key) || !(sMap.get(key).equals(tMap.get(key)))){
                return false;
            }
        }
        return true;
    }
}
