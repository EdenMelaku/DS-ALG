package HardProblems;

public class Problems {

    /*
    Write a method to shuffle a deck of cards. It must be a perfect shuffle - in other words,
each 52! permutations of the deck has to be equally likely. Assume that you are given
a random number generator which is perfect.
     */

    public static void shuffelCards(int cards[]) {
        int  temp;

        for(int i=0;i<cards.length;i++) {
            int random=(int) (Math.random() *(cards.length-i))+i;
            temp=cards[i];
            cards[i]=cards[random];
            cards[random]=temp;
        }

    }
    /*
    Write a function that adds two numbers. You should not use + or any arithmetic op-
erators.
     */
   public int add(int a, int b){
        if(b==0) return a;
        int sum=a^b;
        int carry=( a&b ) <<1;
       return add(sum,carry);
   }

/*
Write a method to randomly generate a set of m integers from an array of size n. Each
element must have equal probability of being chosen.
 */

   public int[] fetchRand(int []from, int m) {
    


   }


}
