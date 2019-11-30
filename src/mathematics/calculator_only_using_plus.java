package mathematics;

public class calculator_only_using_plus {
    int x;
    int y;
    boolean are_different_sign;
    calculator_only_using_plus(int x,int y){
        this.x=x;
        this.y=y;
        are_different_sign=areDifferent(x,y);
    }

    boolean areDifferent(int x, int y){
        return(x<0&&y>=0)||(x>=0&&y<0);
    }

    int negate(int number){
        int n=0;
        for(int i = 1; i<=number;i++){
            n=n-1;
        }
    return n;
    }

    int sum(){
        return x+y;
    }
    int different(){
        return x+negate(y);
    }
    int product(){
        int prod=0;
        int a=abs(x);
        int b=abs(y);
        for(int i=1;i<=b;i++){
            prod=prod+a;
        }
        if(are_different_sign) return negate(prod);
        return prod;
    }
    int abs(int a){
        if(a<0){
            int x=0;
            for(int i=0;i>a;i+=negate(1)){
                x++;
            }
            a=x;
        }
        return a;
    }

    int quotient (int rem){

/*
        if(rem<=0) return 0;
        return quotient(rem-y)+1;

 */
        int a=abs(x);
        int b=abs(y);

   int res=-1;
   for(int i=a;i>=0;i-=b){
       res++;
   }
   if(are_different_sign) return negate(res);
   return res;

    }

    public static void main(String ... args){
        calculator_only_using_plus calculator=new calculator_only_using_plus(15,-5);
        System.out.println("sum = "+calculator.sum());
        System.out.println("diff = "+calculator.different());

        System.out.println("product = "+calculator.product());
        System.out.println("quotient = "+calculator.quotient(calculator.x));


    }

}
