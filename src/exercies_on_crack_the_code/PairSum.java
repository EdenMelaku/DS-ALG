package exercies_on_crack_the_code;
/*
given an array A[] of n numbers and another number x, determines whether or not there exist two elements in S whose
sum is exactly x.
 */
public class PairSum {

    public static boolean findSum(int[] A,int sum){
        boolean[] value=new boolean[1000];
        for(int i=0;i<A.length;i++) {
            int dif = sum - A[i];
            if (dif >= 0 && value[dif]) {
                return true;
            }

            value[A[i]] = true;
        }
            return false;
    }

    public static void main(String ... args) {
        int[]A={1,5,6,-9,4,2};
        System.out.println(findSum(A,31));
    }
}
