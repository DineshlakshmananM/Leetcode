class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int x:nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        int c=0;
        for(Map.Entry<Integer,Integer>x:h.entrySet()){
            if(x.getValue()==1){
                c+=x.getKey();
            }
        }
        return c;
    }
}