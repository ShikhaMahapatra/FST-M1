package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args)
    {
        Map<Integer,String> colours=new HashMap<>();
        colours.put(1,"Orange");
        colours.put(2,"Green");
        colours.put(3,"Yellow");
        colours.put(4,"Blue");
        colours.put(5,"Pink");
        System.out.println("Colors are "+colours);
        colours.remove(2);
        if(colours.containsValue("Green"))
            System.out.println("Green is there");
        else
            System.out.println("Green is not there");
        System.out.println(colours.size());
    }
}
