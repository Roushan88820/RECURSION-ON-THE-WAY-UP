import java.util.*;
import java.io.*;

public class Main {   
public static void main(String [] args) {

    Scanner scn = new Scanner(System.in);
    int r = scn.nextInt();
    int c = scn.nextInt();

    print_maize_paths( 1, 1 , r, c , "");

}

public static void print_maize_paths(int sr , int sc , int dr , int dc ,String paths) {

    if(sr == dr && sc == dc) {
        System.out.println(paths);
        return;
    }
    else if(sr > dr || sc > dc ) {
        return;
    }
 
    print_maize_paths(sr, sc + 1, dr, dc , paths + "h");
    print_maize_paths(sr + 1, sc, dr, dc, paths + "v");
}
}