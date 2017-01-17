package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDiff
{
    public static void main(String args[]) throws Exception
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[][] = new int[n][n];
        
        for(int a_i=0; a_i < n; a_i++)
        {
            for(int a_j=0; a_j < n; a_j++)
            {
                a[a_i][a_j] = in.nextInt();
            }
        }

        int ai = 0;
        int aj = 0;
        int first_sum = 0;
        int second_sum = 0;
        for(int i = 0; i < n; i++)
        {
            first_sum += a[ai++][aj++];
        }

        ai = 0;
        for(int j = n-1; j >= 0; j--)
        {
            second_sum += a[ai][j];
            ai++;
        }

        System.out.println(Math.abs(first_sum-second_sum));

        in.close();
    }
}