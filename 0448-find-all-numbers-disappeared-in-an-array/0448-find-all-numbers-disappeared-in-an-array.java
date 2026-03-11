class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int x:nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        List<Integer>l=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!h.containsKey(i)){
                l.add(i);
            }
        }
        return l;
    }
}