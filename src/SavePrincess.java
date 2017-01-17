package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SavePrincess {
    static void displayPathtoPrincess(int n, String [] grid){
        int m = 0;
        int p = 0;
        int index=0;

        for(int i = 0; i < grid.length; i++) {

            String[] cols = grid[i].split("");

            for(int j = 0; j < cols.length; j++) {
                if(cols[j].equals("m"))
                    m = index;
                if(cols[j].equals("p"))
                    p = index;

                if (cols[j].equals(""))
                    continue;
                
                index++;
            }
        }

        ArrayList<String> moves = new ArrayList<>();
        
        int diffy = (p/n) - (m/n);
        int diffx = (p%n) - (m%n);
        
        for (int y = 0; y < Math.abs(diffy); y++) {
            if(diffy < 0) 
                moves.add("UP");
            else if(diffy > 0)
                moves.add("DOWN");
        }
        for (int x = 0; x < Math.abs(diffx); x++) {
            if(diffx < 0)
                moves.add("LEFT");
            else if(diffx > 0)
                moves.add("RIGHT");
        }

        for(int i = 0; i < moves.size(); i++)
            System.out.println(moves.get(i));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

        displayPathtoPrincess(m,grid);
    }
}
