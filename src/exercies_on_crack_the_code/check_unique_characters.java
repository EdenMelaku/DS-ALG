package exercies_on_crack_the_code;

import java.util.HashSet;
import java.util.Set;

public class check_unique_characters {

    public static boolean is_unique(String word){
        String [] newStr=word.split("");
        Set<String> unique=new HashSet<String>();
        for(String character:newStr) unique.add(character);
        return unique.size() == newStr.length;
    }

    public static char[] remove_duplicates(char[] word){
        int unique=0;
        for(int i=0;i<word.length;i++){
            boolean found=false;
            for(int j=0;j<i;j++){
                if(word[i]==word[j]){
                    found=true;
                }

            }
            if(!found){
                word[unique]=word[i];
                unique++;
                continue;
            }

                word[i]=0;

        }
        return word;
    }

    public static void main(String ... args){

        String word ="edkkkn";
        System.out.println(is_unique(word));
        char [] newW={'e','d','n','e','n','j'};
        System.out.println(remove_duplicates(newW));
    }
}
