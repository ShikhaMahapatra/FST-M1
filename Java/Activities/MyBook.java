package activities;

public class MyBook extends Book {
    public void setTitle(String s) {
        title = s;
    }
public static void main(String[] args)
{
    MyBook newNovel=new MyBook();
    String title="Life of a Pie";
    newNovel.setTitle(title);
    System.out.println("The Title of Book is "+newNovel.getTitle());
}
}
