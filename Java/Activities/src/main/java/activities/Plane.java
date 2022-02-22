package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
        private List<String> passengers;
        private int maxPassengers;
        private Date lastTimeTookOf;
        private Date lastTimeLanded;
        public Plane(int numPassengers)
    {
        this.maxPassengers=numPassengers;
        this.passengers= new ArrayList<String>();
    }
    public void onboard(String passenger)
    {
        passengers.add(passenger);
    }
    public Date takeOff()
    {
    lastTimeTookOf=new Date();
    return lastTimeTookOf;
    }
    public  void land()
    {
    lastTimeLanded=new Date();
    passengers.clear();
    }
    public Date getLastTimeLanded()
    {
    return lastTimeLanded;
    }
    public List<String> getPassesngers()
    {
    return passengers;
    }
}
