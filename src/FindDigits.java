package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int results[] = new int[t];

        for(int a = 0; a < t; a++){
            int n = in.nextInt();
            int p = n;

            int count = 0;

            while(n != 0) {

                if(n%10 != 0 && p%(n%10) == 0) {
                    count++;
                }

                n /= 10;
            }
            results[a] = count;
        }

        for(int i = 0; i < t; i++)
            System.out.println(results[i]);

        in.close();
    }
}
