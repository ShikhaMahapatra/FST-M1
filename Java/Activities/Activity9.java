package activities;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args)
    {
        List<String> myList=new ArrayList<String>();
        myList.add("Sharma");myList.add("Verma");myList.add("Kapoor");myList.add("Khan");myList.add("Roy");
        for (String s:myList)
            System.out.println(s);
        System.out.println("The 3rd name in the ArrayList "+myList.get(2));
        System.out.println("Is Khan in the list "+myList.contains("Khan"));
        System.out.println("The size of myList is "+myList.size());
        System.out.println("Removing Kapoor from my List ");
        myList.remove("Kapoor");
        System.out.println("The size of myList after removing "+myList.size());


    }
}
