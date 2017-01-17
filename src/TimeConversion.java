package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        Calendar c = Calendar.getInstance();
        SimpleDateFormat inpuFormatter = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat outputFormatter = new SimpleDateFormat("HH:mm:ss");

        try
        {
            c.setTime(inpuFormatter.parse(time));
        } catch(ParseException e) {
            e.printStackTrace();
        }

        System.out.println(outputFormatter.format(c.getTime()));
        
        in.close();
    }
}