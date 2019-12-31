package array_manipulation;

public class Median {
    public static int[] findMeadian(int[]A){
        int[] medians=new int[2];
        medians[0]=0;
        medians[1]=A.length-1;
        for(int i=0,j=A.length-1;i<j;i+=2,j-=2){
            if(A[i]<=A[i+2]){medians[0]++;}
            if(A[j]>=A[j-2]){medians[1]--;}

            System.out.println(medians[0]+" "+medians[1]);

        }
        return medians;
    }

    /*
    * given 2 sorted arrays of any length, find out the median of them if they are sorted into a single array*/

    static int findMedian(int[]A, int[]B){
        int median=0;
        int count=0, i=0,j=0;
        int lim=(A.length+B.length)/2;

        while(count<=lim) {
            int prev=median;
            count++;
            if(i<A.length&&j<B.length) {
                if(A[i]<B[j]) {
                    median = A[i];
                    i++;
                }
                else {
                    median=B[j];
                    j++;
                }

            }
            else if(i<A.length) {
                median=A[i];
                i++;
            }
            else{
                median=B[j];
                j++; }
            if(lim==count&&(lim&1)==0) {
                median=(prev+median)/2;
            }

        }
        return median;
    }



    public static void main(String ... args) {
        int[] A={1,2,3,4,5,6,7,3,4,5};
       // int[] med=findMeadian(A);
       // System.out.println(A[med[0]]+"  "+A[med[1]]);
        //System.out.println(med[0]+" "+med[1]);

        int[] B={-5,3,5,7,9};
        int[] C={-12,-7,-1,4,6,9,12,20};

        System.out.println(findMedian(B,C));


    }
}
