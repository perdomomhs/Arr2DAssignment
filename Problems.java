public class Problems{

    // First you will write the for loops that correspond to each traversal 
    // Put your answer inside the comment so you don't get errors

    /*Traversal 1. Row-Wise. Left to right 
      →[1,2,3]
      →[4,5,6]
      →[7,8,9]







    */

    /*Traversal 2. Row-Wise. Right to left
      [1,2,3]← 
      [4,5,6]← 
      [7,8,9]← 







    */

    /*Traversal 3. Column-Wise. Top to bottom 
         ↓ ↓ ↓ 
        [1,2,3]
        [4,5,6]
        [7,8,9]






    */
    
    /*Traversal 4. Column-Wise. Bottom to top  
        [1,2,3]
        [4,5,6]
        [7,8,9]
         ↑ ↑ ↑





        
    */

    /*Traversal 5. Row-Wise. Alternating direction
      →[1,2,3]
       [4,5,6]←
      →[7,8,9]







    */

    /*Traversal 6. Column-Wise. Alternating directions  
           ↓
        [1,2,3]
        [4,5,6]
        [7,8,9]
         ↑   ↑





        
    */

    //*** NOTICE: You should be able to reverse the direction of any the traversals. I won't make you write out ***/

    public static double mean(int[][] arr2D){

        return 0;
    }

    public static int max(int[][] arr2D){

        return 0;
    }  

    //returns the column specifed by the colIndex;
    public static int[] getCol(int[][] arr2D, int colIndex){

        return null;
    }

    //returns the row specified by the rowIndex
    public static int[] getRow(int[][] arr2D, int rowIndex){

        return null;
    }

    //Using Traversal 3, How many times does the sign of the numbers change (pos to neg || neg to pos)
    public static int signChangeCount(int[][] arr2D){

        
        return 0;
    }

    //Same as above. Using Traversal 5
    public static int signChangeCount2(int[][] arr2D){

        return 0;
    }

    //returns an array with the maximum element from each column
    public static int[] maxCols(int[][] arr2D){

        return null;
    }
    
    //returns an array with average of every row
    public static double[] avgRows(int[][] arr2D){

        return null;
    }

    //returns the index of the row with the smallest avg. HINT: use the function above to get the average rows
    public static int minAvgRows(int[][] arr2D){

        return 0;
    }

    //returns the index of the column that has the most repetitions of the number num
    public static int colWithRepetitions(int[][] arr2d, int num){
        return 0;
    }

    //A row/col is odd if the sum of all of the elements in that row/col is odd. The function returns the count of odd rows and odd cols
    public static int oddRowsAndCols(int[][] arr2D){

        return 0;
    }

    //Using Traversal 6, how many elements do I need to add until the total becomes negative. return -1 if total never becomes negative
    public static int countUntilNegative(int[][] arr2d){
        return 0;
    }

    //The following problems deal with the ParkingSpot Class.  Assume that 
    
    //Finds an unoccupied parking spot
    public static ParkingSpot findAParkingSpot(ParkingSpot[][] arr2D){

        return null;
    }

    //Finds two ParkingSpot next to each other that are unoccupied. They must be in the same row.
    public static ParkingSpot findConsecutiveSpots(ParkingSpot[][] arr2D){
        return null;
    }

    //Reserves the parking spots from the list of numbers by setting them to "occupied".
    public static void  reserveSpots(ParkingSpot[][] spots, int[]  numbers){

    }

    //Finds the closest unoccupied spot
    public static ParkingSpot bestSpot(ParkingSpot[][] spots){
        

        return null;
    }  

}