import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        print_stair_paths(n , "");

    }

    public static void print_stair_paths( int n , String paths) {

        if(n < 0) {
            return ;
        }
        else if(n == 0) {
            System.out.println(paths);
            return;
        }

        print_stair_paths(n-1, paths + "1");
        print_stair_paths(n-2, paths + "2");
        print_stair_paths(n-3, paths + "3");

    }
}