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

    public static void main(String ... args) {
        int[] A={1,2,3,4,5,6,7,3,4,5};
        int[] med=findMeadian(A);
       // System.out.println(A[med[0]]+"  "+A[med[1]]);
        //System.out.println(med[0]+" "+med[1]);


    }
}
