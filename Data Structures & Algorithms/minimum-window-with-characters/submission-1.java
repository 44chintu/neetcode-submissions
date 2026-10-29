class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> have = new HashMap<>();
        for(char ch:t.toCharArray()){
            need.put(ch,need.getOrDefault(ch,0)+1);
        }
        int needSize = need.size();
        int haveSize=0;
        int start = -1;
        int minLen = Integer.MAX_VALUE;
        while(r<s.length()){
            char chr = s.charAt(r);
            have.put(chr,have.getOrDefault(chr,0)+1);
            if(need.containsKey(chr) && need.get(chr).intValue() == have.get(chr).intValue()){
                haveSize++;
            }
            while(haveSize == needSize){
                if(minLen>(r-l+1)){
                    start = l;
                    minLen=(r-l+1);
                }
                char chl = s.charAt(l);
                have.put(chl,have.get(chl)-1);
                if(need.containsKey(chl) && have.get(chl)<need.get(chl)){
                    haveSize--;
                }
                if(have.get(chl)==0){
                    have.remove(chl);
                }
                l++;
            }
            r++;
        }
        if(start==-1) return "";
        return s.substring(start,start+minLen);
        
    }
}
