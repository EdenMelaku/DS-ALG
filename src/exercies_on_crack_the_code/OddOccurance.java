package exercies_on_crack_the_code;
/*
Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times. Find the
number in O(n) time & constant space.
 */
public class OddOccurance {

    public static int getOddOcurrance(int[]A) {
        int res=A[0];

        for(int i=0;i<A.length;i++) {
            res=res^A[i];
        }
        return res;
    }

    public static void main(String ... args) {
        int[]A={1,4,5,7,2,4,5,6,2,1,1,4,1};
        System.out.println(getOddOcurrance(A));
    }
}
