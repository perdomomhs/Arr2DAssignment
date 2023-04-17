import java.util.Arrays;
public class Test {
    public static void main(String[] args) {

        int[][] arr1 = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[][] arr2 = {{1,2,3,5},
                        {4,5,6,6},
                        {7,8,9,7}};
        int[][] arr3 = {{-1,-2,-3},
                        {-4,-5,-6},
                        {-8,-8,-8}};
        int[][] arr4 = {{-1,1,0,0},
                        {-2,-2,0,4},
                        {-1,2,-2,0}};
        int [][]  arr5 = {{-2,-2,1},
                          {3,-2,-2},
                          {2,-2,1}};

        
        assert Problems.mean(arr1) == 5;
        assert Problems.mean(arr2) == 5.25;
        assert Problems.max(arr1) == 9;
        assert Problems.max(arr3) == -1;
        
        int[] col1 = {2,5,8};
        assert Arrays.equals(col1, Problems.getCol(arr2, 1));
        col1[0] =-2;col1[1]=-5;col1[2]=-8;
        assert Arrays.equals(col1, Problems.getCol(arr3,1));

        int[] row2 = {7,8,9,7};
        assert Arrays.equals(row2,Problems.getRow(arr2, 2));
        int[] row22 = {-8,-8,-8};
        assert Arrays.equals(row22,Problems.getRow(arr3, 2));
        assert Problems.signChangeCount(arr3) == 0;
        assert Problems.signChangeCount(arr4) == 5;
        assert Problems.signChangeCount2(arr2) == 0;
        assert Problems.signChangeCount2(arr4) == 5;
        int[] mCols = {7,8,9};
        assert Arrays.equals(mCols,Problems.maxCols(arr1));
        int[] mCols2 = {-1,-2,-3};
        assert Arrays.equals(mCols2,Problems.maxCols(arr3));
        double[] aRow = {2.75,5.25,7.75};
        assert Arrays.equals(aRow, Problems.avgRows(arr2));
        assert Problems.minAvgRows(arr3) == 2;
        assert Problems.colWithRepetitions(arr4, 0) == 2;
        assert Problems.oddRowsAndCols(arr2)==4;
        assert Problems.oddRowsAndCols(arr3) == 4;
        assert Problems.oddRowsAndCols(arr4) == 2;
        assert Problems.countUntilNegative(arr2) == -1;
        assert Problems.countUntilNegative(arr5) == 5;

        ParkingSpot[][] spots = new ParkingSpot[3][3];
        spots[0][0] = new ParkingSpot(4, 10); spots[0][0].setOccupied();
        spots[0][1] = new ParkingSpot(17, 12);spots[0][1].setOccupied();
        spots[0][2] = new ParkingSpot(22,14);
        
        spots[1][0] = new ParkingSpot(41,50);
        spots[1][1] = new ParkingSpot(12,52);
        spots[1][2] = new ParkingSpot(9,54);

        spots[2][0] = new ParkingSpot(4,90);
        spots[2][1] = new ParkingSpot(8,92);
        spots[2][2] = new ParkingSpot(66,94);

        assert Problems.findAParkingSpot(spots).equals(spots[0][2]);
        assert Problems.findConsecutiveSpots(spots).equals(spots[1][0]);
        int[]  spotNums ={17,9,66};
        Problems.reserveSpots(spots,spotNums);
        assert spots[0][1].isOccupied() && spots[1][2].isOccupied() && spots[2][2].isOccupied();
        spots[0][2].setOccupied();
        assert Problems.bestSpot(spots).equals(spots[1][0]);
        System.out.println("All Tests Passed");
         
    }
}
