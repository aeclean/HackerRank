package src;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic
{
	@Override
	public int divisorSum(int n)
	{
		int total = 0;
		
		int m = n;
		n++;
		while(n-- > 0) {
			if(n > 0) {
				if(m%n==0) {
					total += n;
				}
			}
		}

		return total;
	}
}

class Interfaces
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}