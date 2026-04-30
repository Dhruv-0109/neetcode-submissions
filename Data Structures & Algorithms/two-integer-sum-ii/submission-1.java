class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int num=0;

        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        for(i=0; i<numbers.length; i++)
        {
            int complement = target - numbers[i];
            if(!map.containsKey(complement))
                map.put(numbers[i],(i+1));
            else{
                num = map.get(complement);
                break;
               
            }
             
        }

        return new int[]{num, (i+1)};
        
    }
}
