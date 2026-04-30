class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       Map<Integer,Integer> map = new HashMap<>();

       for(int n: nums)
        map.put(n, map.getOrDefault(n,0)+1);
       
       List<Integer>[] bucket = new ArrayList[nums.length + 1];

       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        int freq = entry.getValue();
        if(bucket[freq] == null)
            bucket[freq] = new ArrayList<>();
        bucket[freq].add(entry.getKey());
       }

       List<Integer> result = new ArrayList<>();
       for(int i=nums.length; i>=0 && result.size()<k; i--){
        if(bucket[i]!=null) result.addAll(bucket[i]);
       }

       return result.stream().mapToInt(i->i).toArray();
 
    }
}
