package moderate;
/*
Write a method which finds the maximum of two numbers. You should not use if-else
or any other comparison operator.
EXAMPLE
Input: 5, 10
Output: 10
 */
public class number_comparator {
    public static int findMax(int x, int y) {

        int k=x/y;
        int k1=y/x;
        return (x*k+y*k1)/(k+k1);
    }

    public static void main(String ... args){
        System.out.println(findMax(4,9));
    }
}
