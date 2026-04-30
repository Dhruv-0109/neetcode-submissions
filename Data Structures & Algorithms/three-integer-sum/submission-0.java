class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<len-2; i++)
        {
            int j=i+1; int k=len-1;

            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0)
                {
                    List<Integer> triplets = Arrays.asList(nums[i],nums[j],nums[k]);
                    Collections.sort(triplets);
                    if(set.add(triplets))
                        list.add(triplets);
                    
                    j++; k--;

                }

                else if(sum>0)
                    k--;
                else
                    j++;

            }


        }

        return list;
        
    }
}
