package activities;

public class Activity2 {
    public static void main(String[] args)
    {
        int[] array={10, 77, 10, 54, -11, 10};
        int value=0;
        for(int a:array)
        {
            if(a==10)
                value=value+a;
        }
        if(value==30)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
