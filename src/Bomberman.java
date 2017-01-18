package src;

import java.util.*;

public class Bomberman
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int delay = input.nextInt();

        char[][] grid = new char[rows][cols];

        for(int i = 0; i < rows; i++) {
            String line = input.next();
            for(int x = 0; x < line.length(); x++) {
                grid[i][x] = line.charAt(x);
            }
        }
        
        char[][] out = new char[rows][cols];
        for(int step = 1; step <= delay; step++) {
            
            if(step == 1 && step == delay) {
                print(grid);
                break;
            }
            
            if(step == 2) {
                for(int i = 0; i < out.length; i++) {
                    for(int j = 0; j < out[i].length; j++) {
                        out[i][j] = 'O';
                    }
                }

                if(step == delay) {
                    print(out);
                    break;
                }
            }
            
            if(step == 3 && step == delay) {
                int[] bombs = getPlacedBombs(grid);
                explodeBombs(grid, out, bombs);
            }
        }
    }

    public static int[] explodeBombs(char[][] grid, char[][] out, int[] bombs) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //Calc bombs reach
        for(int i = 0; i < bombs.length; i++) {
            int rr = grid.length;
            int cc = grid[i].length;
            
            int row = (bombs[i]/grid.length)-1;
            int col = (bombs[i]%grid.length)-1;
            
            out[row][col] = new String(".").charAt(0);
            
            if((row - 1) >= 0) {
                out[row-1][col] = new String(".").charAt(0);
            }
            if((row + 1) < rr) {
                out[row+1][col] = new String(".").charAt(0);
            }
            
            if((col-1) >= 0) {
                out[row][col-1] = new String(".").charAt(0);
            }
            if((col+1) < cc) {
                out[row][col+1] = new String(".").charAt(0);
            }
        }
        
        print(out);
        
        int[] result = new int[list.size()];
        return result;
    }

    public static int[] getPlacedBombs(char[][] grid) {
        
        ArrayList<Integer> b = new ArrayList<>();
        
        for(int i = 0; i < grid.length; i++) {
            
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 'O') {
                    b.add((i+1)*grid.length+(j+1)%grid[i].length);
                }
            }
        }
        
        int[] out = new int[b.size()];
        for(int i = 0; i < b.size(); i++) {
            out[i] = b.get(i);
        }
        
        return out;
    }

    public static void print(int[] b) {
        for(int i = 0; i < b.length; i++)
            System.out.print(b[i]);
        System.out.println();
    }

    public static void print(char[][] b) {
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++)
                System.out.print(b[i][j]);
            System.out.println();
        }
    }
}