class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int l=0;
        int h=s1.length()-1;
        HashMap<Character,Integer> hs = new HashMap<>();
        HashMap<Character,Integer> hs2 = new HashMap<>();

        for(char ch:s1.toCharArray()){
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }

        for(int i=l;i<=h;i++){
            hs2.put(s2.charAt(i),hs2.getOrDefault(s2.charAt(i),0)+1);
        }
        if(hs.equals(hs2)) return true;

        while(h<s2.length()-1){
            hs2.put(s2.charAt(l),hs2.get(s2.charAt(l))-1);
            if(hs2.get(s2.charAt(l))==0) hs2.remove(s2.charAt(l));
            l++;
            h++;
            hs2.put(s2.charAt(h),hs2.getOrDefault(s2.charAt(h),0)+1);
            if(hs.equals(hs2)) return true;
        }
        return false;
    }
}
