package src;

import java.io.*;
import java.util.*;

public class StairCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        String sharp = String.format("%"+total+"s", '#').replace("#", " ");

        for(int i = total; i > 0; i--) {
            int index = total-(i-1);
            String output = sharp.substring(index, total) + sharp.substring(total-index, total).replace(" ", "#");
            System.out.println(output);
        }

        sc.close();
    }
}