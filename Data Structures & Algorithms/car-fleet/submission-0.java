// Problem Restated: 
// “How many groups of cars reach the destination, given that faster cars cannot pass slower ones ahead?”

// Approach:
// 1. Map the cars to its speed with 2D array of 2 columns 
// 2. Sort the cars based on its which is closest to the destination
// 3. now, initialise the maxTime that we have seen so far for cars processed

// 4. calculate time = distance (target-position) / speed
// 5. if the current time taken for car[i] > the maxTime seen so far, that means it needs a new fleet so increment fleets and update maxTime for the next car as cars cannot overtake 


class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      
      if(position.length==1) return 1;

      int[][]cars = sortCarsByPosition(position, speed);
      int len = position.length;

      double maxTime = 0; int fleets = 0;

      for(int i=len-1; i>=0; i--)
      {
        //time = distance/speed
        double time = (double)(target-cars[i][0]) / cars[i][1];

        if(time > maxTime)
        {
            fleets++;
            maxTime = time;
        }
      }
      return fleets;
    }
    
    public int[][] sortCarsByPosition(int[]position, int[]speed)
    {
        int len = position.length;
        int[][]cars = new int[len][2];

        for(int i=0; i<len; i++)
        {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a,b)->a[0]-b[0]);

        return cars;
    }
}
