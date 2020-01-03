package array_manipulation;

public class mainpulator {
    public static int[] mainpulate(int[] elements){
        int i;
        int[] sorted=new int[elements.length];
        int zeros=1;
        int count=0;
        for( i=0;i<elements.length;i++){
            if(elements[i]==0){
                sorted[zeros]=0;
                zeros++;
            }
            else  if(i<=elements.length-2){
                if (elements[i]==elements[i+1]){
                    sorted[count]=elements[i]*2;
                    count++;
                    elements[i+1]=0;
                }
                else{
                    sorted[count]=elements[i];
                    count++;
                }
            }
            else {
                sorted[count]=elements[i];
                count++;

            }


        }



        return sorted;
    }


    public static int maximum_difference(int[]elements){
        int max_diff=-1;
        int real_min=0;
        int min_ind=0;
        int max_ind=0;

        for(int i=1;i<elements.length;i++){
            if(elements[i]<elements[min_ind]){
                min_ind=i;
            }
            if(elements[max_ind]<elements[i]){
                max_ind=i;
                real_min=min_ind;
            }
        }
        if(max_ind==0){
            return max_diff;
        }
        max_diff=elements[max_ind]-elements[real_min];
        return max_diff;
    }

/*Maximum difference between two elements such that larger element appears after the
smaller number*/

 static int getMaxDifference(int[] arr) {
       int min1=0,min2=0,max=1;
       for (int i=1;i<arr.length;i++) {
           if(arr[min2]>arr[i]) min2=i;
           if(arr[max]<arr[i]) {
               max=i;
               if(min2<max)   min1=min2;
               }
           }
       //System.out.println(min1+" "+min2+" "+max);
       return arr[max] - arr[min1];
   }

//https://www.geeksforgeeks.org/microsoft-interview-experience-set-141-off-campus-online-coding-test-idc/
    public static void main(String ... args){
        int nums[]={2,2,0,4,0,2};

// test array manipulator
       // System.out.println(" ");
        int manupilated[]=mainpulate(nums);
        for(int i=0;i<manupilated.length;i++){
           // System.out.print(manupilated[i]+" , ");
        }
       // System.out.println("");
        //System.out.println("FINDING MAXIMUM DIFFERENCE ");
        //test max difference
        int elems[]={30, 22, 9, 10, 11};
        //System.out.println(maximum_difference(elems));

        System.out.println(getMaxDifference(elems));

    }
}
