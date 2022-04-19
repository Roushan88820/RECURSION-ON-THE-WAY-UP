import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args) throws Exception{

    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    print_kpc (str , "" );
    
    }

    static String [] codes = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"}; 

    public static void print_kpc(String ques , String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String ros = ques.substring(1);

        String code = codes[ch - 48];

        for(int i = 0; i<code.length(); i++) {
            
            char calling_ch = code.charAt(i);

            print_kpc(ros, ans + calling_ch);

        }


    }
}