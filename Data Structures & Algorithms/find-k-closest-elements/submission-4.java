class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> al = new ArrayList<>();
        int ele=0;
        int l = 0;
        int r = 0;
        int i=0;
        while(i<arr.length){
            if(arr[ele]<=x) ele++;
            i++;
        }
        if(ele==arr.length){
            for(int j = arr.length-k;j<arr.length;j++){
                al.add(arr[j]);
            }
            return al;
        };
        l=ele-1;
        r = ele;
        i=0;
        while(i<k && l>=0 && r<arr.length){
        if(Math.abs(arr[l]-x)==Math.abs(arr[r]-x)){
            if(arr[l]<arr[r]){
                al.add(arr[l--]);
            }
            else{
                al.add(arr[r++]); 
            }
        }
        else if(Math.abs(arr[l]-x)<Math.abs(arr[r]-x)){
            al.add(arr[l--]);
        }
        else{
            al.add(arr[r++]);
        }
        i++;
        }
        while(i<k && l>=0){
            al.add(arr[l--]);
            i++;
        }
        while(i<k && r<arr.length){
            al.add(arr[r++]);
            i++;
        }
        Collections.sort(al);
        return al;
    }
}