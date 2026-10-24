class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int h=0;
        int maxPick=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        while(h<fruits.length){
            hs.put(fruits[h],hs.getOrDefault(fruits[h],0)+1);
            if(hs.size()>2){
                hs.put(fruits[l],hs.get(fruits[l])-1);
                if(hs.get(fruits[l])==0) hs.remove(fruits[l]);
                l++;
            }
            maxPick=Math.max(maxPick,(h-l+1));
            h++;
        }
        return maxPick;
    }
}