package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args)
    {
        Set<String> hs=new HashSet<>();
        hs.add("Mango");hs.add("Apple");hs.add("Orange");hs.add("Grapes");hs.add("pineApple");hs.add("Kiwi");
        System.out.println("The size of the set is "+hs.size());
        hs.remove("Kiwi");
        System.out.println("Is Mango present in the set "+hs.contains("Mango"));
        if(hs.remove("Papaya"))
            System.out.println("Papaya removed");
        else
            System.out.println("Papaya is not present");
    System.out.println("The Set of fruits are "+hs);
    }
}
