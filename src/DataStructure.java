package src;

import java.util.*;
import java.io.*;

class DataStructure
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double max_int = Math.pow(10,5);

        if(n > max_int)
            return;

        Map<String, Integer> phones = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            int phone = in.nextInt();

            phones.put(name, phone);
        }

        
        int counter = 0;
        while(in.hasNext()){
            String s = in.next();

            boolean found = false;
            if(phones.containsKey(s))
            {
                Integer phone = phones.get(s);
                found = true;
                System.out.println(s+"="+phone);
            }
            
            if(!found)
                System.out.println("Not found");

            counter++;
            if(counter > Math.pow(3,2))
                break;
        }
        
        in.close();
    }
}