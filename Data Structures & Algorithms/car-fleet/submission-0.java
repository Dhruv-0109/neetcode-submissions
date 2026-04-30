class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      
        int len = position.length;
        if(len==0)return 0;

        //Step 1: create (position,speed) pairs 
        double[][]cars = new double[len][2];
        for(int i=0; i < len; i++)
        {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target-position[i])/speed[i];
        }
        Arrays.sort(cars, (a,b) ->Double.compare(b[0],a[0])); //Sort descending by position

        //Step 2: Use a stack to track fleets
        Stack<Double>stack = new Stack<>();
        for(int i=0; i<len; i++)
        {
            double time = cars[i][1]; //time for this car to reach the target
            
            //if the stack is empty or current car takes more time than the last fleet, form new
            if(stack.isEmpty() || time > stack.peek())
                stack.push(time);  
        }
        return stack.size(); //return the number of fleets
    }
}
