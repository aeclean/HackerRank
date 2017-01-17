package src;

import java.util.LinkedList;
import java.util.Scanner;

public class Arithmetic 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        float tipTotal = (float)mealCost * tipPercent / 100;
        float taxTotal = (float)mealCost * taxPercent / 100;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tipTotal + taxTotal);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");

        LinkedList ll = new LinkedList();
        ll.add(8);
        ll.add(7);
        ll.add(2);
        ll.add(4);
        ll.add(6);
        ll.add(5);
        ll.add(1);
        ll.add(3);
        System.out.println("LL " + ll);
    }
}