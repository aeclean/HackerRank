package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OldLanguages
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();

        if(tests > 20)
            throw new Exception("Wrong test count");

        for(int i = 0; i < tests; i++)
        {
            int totalWords = in.nextInt();
            int[] results = new int[totalWords];
            String[] words = new String[totalWords];

            if(totalWords > 100)
                throw new Exception("Wrong word count");
            
            int newPhrases = in.nextInt();
            if(newPhrases > 50)
                throw new Exception("Wrong phrase count");

            for(int w = 0; w < totalWords; w++) {
                words[w] = in.next();
            }

            StringBuilder finalPhrase = new StringBuilder();
            for(int p = 0; p < newPhrases; p++)
            {
                int lineTestCount = in.nextInt();

                for(int ph = 0; ph < lineTestCount; ph++) {
                    String phrase = in.next();

                    if(phrase.length() > 5)
                        throw new Exception("Wrong pharse length");

                    finalPhrase.append(phrase);
                }
            }
            System.out.println(finalPhrase.toString());

            for(int m = 0; m < totalWords; m++)
            {
                if(finalPhrase.toString().contains(words[m])) {
                    results[m] = 1;
                } else {
                    results[m] = 0;
                }
            }

            String res = "";
            for(int k = 0; k < totalWords; k++) {
                if(results[k] == 0) {
                    res+= "NO ";
                } else {
                    res+="YES ";
                }
            }
            System.out.println(res);
        }
        
        in.close();
    }
}

/*
3 2
piygu ezyfo rzotm
1 piygu
6 tefwz tefwz piygu ezyfo tefwz piygu
-----
4 1
kssdy tjzhy ljzym kegqz
4 kegqz kegqz kegqz vxvyj
*/