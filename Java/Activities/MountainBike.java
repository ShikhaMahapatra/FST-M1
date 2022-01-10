package activities;

public class MountainBike extends Bicycle{
int seatHeight;

    MountainBike(int gears, int speed,int height) {
        super(gears, speed);
        seatHeight=height;
    }
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }
    public String bicycleDesc() {

        return(super.bicycleDesc()+"\nHeight of Seat is "+seatHeight);
    }
}
