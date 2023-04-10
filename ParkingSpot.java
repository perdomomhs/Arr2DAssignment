public class ParkingSpot {
    private int number;
    private double distanceToDoor;
    private boolean occupied;

    public ParkingSpot(int num, double distance){
        number = num;
        distanceToDoor = distance;
        occupied = false; 
    }

    public void setOccupied(){
        occupied =true;
    }

    public void setUnoccupied(){
        occupied = false;
    }

    public int getNumber() {
        return number;
    }

    public double getDistanceToDoor() {
        return distanceToDoor;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean equals(Object o){
        ParkingSpot ps = (ParkingSpot)o;
        return number == ps.number;
    }


}
