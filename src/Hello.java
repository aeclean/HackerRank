package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hello
{
	public static void main(String args[]) throws Exception
	{
		Scanner scan = new Scanner(System.in);

        int inputCount = 0;
        int arraySize = 0;

        while(inputCount < 2)
        {
            String s = scan.nextLine();

            if(inputCount == 0)
                arraySize = Integer.parseInt(s);
            else
            {
                String values[] = s.trim().split(" ");

                if(values.length != arraySize)
                    throw new Exception("Wrong number of items in array");

                int count = 0;
                for(int i = 0; i < values.length; i++)
                    count += Integer.parseInt(values[i]);

                System.out.println(count);
            }

            inputCount ++;
        }

		scan.close();
	}
}