package activities;

import java.util.Scanner;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of passengers");
        int numPass=sc.nextInt();
        System.out.println("Enter Passenger Name");
        Plane plane=new Plane(10);
    for(int i=0;i<numPass;i++)
    {
        String passengerDetails=sc.next();
        plane.onboard(passengerDetails);
    }
    sc.close();
System.out.println("The Plane Take off time is "+plane.takeOff());
System.out.println("The Passengers on Plane are "+ plane.getPassesngers());
Thread.sleep(5000);
plane.land();
System.out.println("The plane landed at the time "+plane.getLastTimeLanded());
    }
}
