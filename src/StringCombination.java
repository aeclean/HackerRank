package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringCombination
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int stringCount = scan.nextInt();
        String p = scan.nextLine();

        for(int i = 0; i < stringCount; i++)
        {
        	String s = scan.nextLine();

        	int odd = s.length()/2 + s.length()%2;
        	int even = s.length()/2;
        	
        	String arrOdd[] = new String[odd];
        	String arrEven[] = new String[even];

        	int oddCount = 0;
        	int evenCount = 0;
        	for(int j = 0;  j < s.length(); j++) 
        	{
        		if(j % 2 == 0) {
	        		arrOdd[oddCount] = String.valueOf(s.charAt(j));
	        		oddCount++;
	        	}
	        	else {
	        		arrEven[evenCount] = String.valueOf(s.charAt(j));
	        		evenCount++;
	        	}
        	}
        	
        	for(int j = 0;  j < arrOdd.length; j++)
        		System.out.print(arrOdd[j]);
        	System.out.print(" ");
        	for(int j = 0;  j < arrEven.length; j++)
        		System.out.print(arrEven[j]);
	        System.out.println("");
        }

        scan.close();
    }
}