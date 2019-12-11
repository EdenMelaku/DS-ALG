package Exercises;

public class Reverse_Sentence {

    public static String reverseString(String sentence){
        String sent="";
        String word="";

        for (int i=0;i<sentence.length();i++){
            String s=sentence.substring(i,i+1);
            if(s.isBlank()){
                sent=word+" "+sent;
                word="";
            }
            else{
                word=word+sentence.charAt(i);
            }
            System.out.println(word);
            System.out.println(sent);

        }
        return sent;
    }

    public static void main(String ... args){
        System.out.println(reverseString("hello my name is eden "));
    }
}
