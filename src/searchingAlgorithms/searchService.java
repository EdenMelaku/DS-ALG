package searchingAlgorithms;
//AKA sequential search
public class searchService {
    public static int LinearSearch(int[] numbers, int key){
     for(int i=0;i<numbers.length;i++){
         if(numbers[i]==key){
             return i;
         }
     }
     return -1;
    }

    public static int BinarySerarch1(int[]numbers, int key){
        int lb=0,ub=numbers.length-1,mid=0;
        boolean increasing=true;


        if(numbers[0]>numbers[1])  increasing=false;

        while(lb<=ub){
            mid=(lb+ub)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if(key<numbers[mid]){
                if(increasing)  ub=mid-1;
                else lb=mid+1;

            }
            else{
                if(increasing) lb=mid+1;
                else ub=mid+1;
            }
        }
        return (-1-mid);
    }

    public static int BinarySerarch2(int[]numbers, int key, int lb,int ub){
        int mid=(lb+ub)/2;
        boolean increasing=true;


        if(numbers[0]>numbers[1])  increasing=false;

        if (lb<=ub){
            mid=(lb+ub)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if(key<numbers[mid]){
                if(increasing)  ub=mid-1;
                else lb=mid+1;


            }
            else{
                if(increasing) lb=mid+1;
                else ub=mid+1;
            }
        }
        return (-1-mid);
    }


}
