package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bitwise
{
    public static void main(String[] args) 
    {
        StringBuilder s = new StringBuilder();
        int n = 2;
        for(int i = 31; i >= 0; i--)
        {
            int v = (1 << i) & n;
            s.append(v!=0 ?"1":"0");
        }

        System.out.println(s.toString());
    }
}