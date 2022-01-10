package activities;

public class Activity3 {
    public static void main(String[] args)
    {
        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        System.out.println("Age on Earth is "+seconds/EarthSeconds);
        System.out.println("Age on MercurySeconds is "+seconds/(EarthSeconds*MercurySeconds));
        System.out.println("Age on VenusSeconds is "+seconds/(EarthSeconds*VenusSeconds));
        System.out.println("Age on MarsSeconds is "+seconds/(EarthSeconds*MarsSeconds));
        System.out.println("Age on JupiterSeconds is "+seconds/(EarthSeconds*JupiterSeconds));
        System.out.println("Age on SaturnSeconds is "+seconds/(EarthSeconds*SaturnSeconds));
        System.out.println("Age on UranusSeconds is "+seconds/(EarthSeconds*UranusSeconds));
        System.out.println("Age on NeptuneSeconds is "+seconds/(EarthSeconds*NeptuneSeconds));

    }
}
