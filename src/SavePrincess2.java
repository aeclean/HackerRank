package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SavePrincess2 {
    static void nextMove(int n, int r, int c, String[] grid){
        int p = 0;
        int index=0;
        int m = r*n+c;

        for(int i = 0; i < grid.length; i++) {

            String[] cols = grid[i].split("");

            for(int j = 0; j < cols.length; j++) {
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
            if(diffy < 0) {
                moves.add("UP");
                break;
            } else if(diffy > 0) {
                moves.add("DOWN");
                break;
            }
        }

        if(moves.size() == 0) {
            for (int x = 0; x < Math.abs(diffx); x++) {
                if(diffx < 0) {
                    moves.add("LEFT");
                    break;
                } else if(diffx > 0) {
                    moves.add("RIGHT");
                    break;
                }
            }
        }

        for(int i = 0; i < moves.size(); i++)
            System.out.println(moves.get(i));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];

        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

        nextMove(n,r,c,grid);
    }
}
