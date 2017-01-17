package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println(fact(n));
    }
    
    private static int fact(int n)
    {
        if(n == 0)
            return 1;
        else
            return n*fact(n-1);
    }
}