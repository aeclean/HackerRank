package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sudoku
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum = -1000;
        int tempsum = 0;
        
        for(int i=0; i < 6; i++)
        {
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < 6; i++)
        {
        	for(int j = 0; j < 6; j++)
        	{
        		if(i+2 < 6 && j+2 < 6) {
        			tempsum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + 
        								 arr[i+1][j+1] + 
        				   arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        			if(tempsum > sum) {
        				sum = tempsum;
        			}
        		}
        	}
        }

        System.out.println("" + sum);

        in.close();
    }
}