package HardProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Problems {

    /*
    Write a method to shuffle a deck of cards. It must be a perfect shuffle - in other words,
each 52! permutations of the deck has to be equally likely. Assume that you are given
a random number generator which is perfect.
     */

    public static void shuffelCards(int cards[]) {
        int temp;

        for (int i = 0; i < cards.length; i++) {
            int random = (int) (Math.random() * (cards.length - i)) + i;
            temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }

    }

    /*
    Write a function that adds two numbers. You should not use + or any arithmetic op-
erators.
     */
    public int add(int a, int b) {
        if (b == 0) return a;
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return add(sum, carry);
    }

/*
Write a method to randomly generate a set of m integers from an array of size n. Each
element must have equal probability of being chosen.
 */

    public int[] fetchRand(int[] from, int m) {
        int randElements[] = new int[m];
        if (m > from.length) return null;
        for (int i = 0; i < m; i++) {
            int rand = (int) (Math.random() * (from.length - i)) + i;
            randElements[i] = from[rand];
            from[rand] = from[i];
            from[i] = randElements[i];

        }
        return randElements;


    }

    /*
    Write a method to count the number of 2s between 0 and n.
     */



    /*
    You have a large text file containing words. Given any two words, find the shortest
distance (in terms of number of words) between them in the file. Can you make the
searching operation in O(1) time? What about the space complexity for your solu-
tion?
     */


    int distance(String words[],String word1, String word2){
        int min= Integer.MAX_VALUE;
        int w1posostion=-1;
        int w2posotion=-1;

        for (int i=0;i<words.length;i++){
            w1posostion=(words[i]==word1)?i:w1posostion;
            w2posotion=(words[i]==word2)?i: w2posotion;
            int currentDifference=w2posotion-w1posostion;
            min=(min>currentDifference)?currentDifference:min;
        }
        return min;

    }

}