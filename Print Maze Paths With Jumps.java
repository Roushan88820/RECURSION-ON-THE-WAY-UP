import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();

        print_maze_paths_with_jumps( 1 , 1 , row , col, "");

    }

    public static void print_maze_paths_with_jumps(int sr , int sc , int dr , int dc , String paths) {      

    if(sr == dr && sc == dc) {
        System.out.println(paths);
        return;
    }

  // horizontal paths 

 for(int ms = 1 ; ms <= dc - sc; ms++) {

 print_maze_paths_with_jumps(sr , sc + ms , dr , dc , paths + "h" + ms );

 }

 // vertical paths 

 for(int ms = 1 ; ms <= dr - sr ; ms++) {

     print_maze_paths_with_jumps(sr + ms , sc , dr , dc , paths + "v" + ms);

 }

 // diagonal paths 
  
  for(int ms = 1 ; ms <= dc - sc && ms <= dr - sr ; ms++) {

      print_maze_paths_with_jumps(sr + ms , sc + ms ,dr , dc , paths + "d" + ms);

  }

}
}
