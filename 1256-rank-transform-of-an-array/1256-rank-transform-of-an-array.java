class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int c[]=arr.clone();
        Arrays.sort(c);
        HashMap<Integer,Integer>h=new HashMap<>();
        int r=1;
        for(int x:c){
            if(!h.containsKey(x)){
                h.put(x,r++);
            }
        }
        int[]n=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           n[i]=h.get(arr[i]);
        }
        return n;
    }
}