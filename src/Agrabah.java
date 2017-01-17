package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Agrabah
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();

        for(int i = 0; i < tests; i++)
        {
            int sellers = in.nextInt();
            int price = in.nextInt();

            int moves = 0;
            int stock = 0;
            for(int j = 0; j < sellers; j++)
            {
                int apples = in.nextInt();

                while(apples%price!=0)
                {
                    int mod = apples%price;
                    float midPrice = ((float)price/2);

                    if(mod >= midPrice) {
                        apples++;
                        stock--;
                    }
                    else {
                        apples--;
                        stock++;
                    }
                    moves++;
                }
            }
            System.out.println(moves);
        }
        

        in.close();
    }
}