package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringMan {

    static boolean matchIgnoreCase(String s1, String s2) {
        if(s1==null||s2==null) return false;
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i)-'a');
            System.out.print(" ");
            System.out.print(s2.charAt(i)-'A' );            System.out.print(" ");

            System.out.print(s2.charAt(i)-'a');            System.out.print(" ");

            System.out.print(s1.charAt(i)-'A');            System.out.print(" ");
            if(s1.charAt(i)!=s2.charAt(i))

                  if(s1.charAt(i)-'a'!=s2.charAt(i)-'A' && s2.charAt(i)-'a'!=s1.charAt(i)-'A') return false;
        }
        return true;
    }

    public static void main(String ... args) {
        System.out.println(matchIgnoreCase(null,null));

    }
}
