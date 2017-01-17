package src;

import java.io.*;
import java.util.*;

class MinMaxSum {
    public static void main(String args[]) throws Exception
    {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        long[] numbers = new long[] {a,b,c,d,e};
        long min = a+b+c+d+e;
        long max = 0;

        for(int i = 0; i < numbers.length;i++) {

            long total = 0;
            for(int j = 0; j < numbers.length; j++) {
                if(j!=i) {
                    total+=numbers[j];
                }
            }

            if(total < min)
                min = total;

            if(total > max)
                max = total;
        }
        System.out.println(min+" "+max);

        in.close();
    }
}