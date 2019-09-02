import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Write a description of class lab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lab
{
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<String>();
        
        str.add("c1");
        str.add("c3");
        str.add("c7");
        str.add("c2");
        str.add("c0");
        str.add("c8");
        str.add("c5");
        str.add("c4");
        str.add("c9");
        str.add("c6");
        Collections.sort(str);
        System.out.println("ArrayList size is " + str.size());
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is in ArrayList ");
        String n = keyboard.next();
        for(int x = 0; x<str.size(); x++)
        {
            //System.out.println(str.get(x));
        }
        if(str.contains(n))
            {
                System.out.println("It is in the ArrayList");
            }
            else
            System.out.println("It is not in the ArrayList");
    }
}