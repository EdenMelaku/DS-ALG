package Chapter1_Arrays_and_strings;
/*
* Implement an algorithm to determine if a string has all unique characters. What if you
* can not use additional data structures?
*/
 class StringAndArrayManipulator {

    public  boolean has_all_unique(String characters) {
        boolean uniqueChars[] = new boolean[256];
        for (int i = 0; i < characters.length(); i++) {
            if (uniqueChars[characters.codePointAt(i)]) {
                return false;
            }
            uniqueChars[characters.codePointAt(i)] = true;
        }
        return true;
    }

    public String CstyleStringReversor(String word) {
        StringBuffer Reversedword=new StringBuffer();
        for(int i=word.length()-2;i>=0;i--){
           Reversedword.append(word.charAt(i));
        }
        Reversedword.append('\n');
        return Reversedword.toString();

    }

    /*
     a better solution for the above problem
     */
    public char[] CstyleStringReversor2(char[] word) {
        char temp;
        int len=word.length-2;

        for(int i=0;i<=len/2;i++){
            temp=word[i];
            word[i]=word[len-i];
            word[len-i]=temp;
        }
return word;
           }


    public String RemoveDuplicated(char[] duplicated) {
        int currentInd=0;
        boolean unique[]= new boolean[256];
        for (int i=0;i<duplicated.length;i++) {
            if(unique[duplicated[i]]==false){
                unique[duplicated[i]]=true;
                char x=duplicated[i];
                duplicated[i]=' ';
                duplicated[currentInd]=x;
                currentInd++;
            }
            else{
                duplicated[i]=' ';
            }
        }

        /*for(int i=currentInd;i<duplicated.length;i++){
            duplicated[i]=' ';

        }*/

        System.out.println(duplicated);
       // return duplicated.toString().substring(0,currentInd);
        return duplicated.toString();
    }

    public void RemoveDuplicated1(char[] duplicated) {
        int currentInd=1;
        boolean unique[]= new boolean[256];
        for (int i=1;i<duplicated.length;i++) {
            int j;
            for( j=0;j<currentInd;j++){
            if(duplicated[i]==duplicated[j]) break;
        }
            if(j==currentInd) duplicated[currentInd++]=duplicated[i];
        }
        //System.out.println(duplicated.);
        duplicated[currentInd]=' ';
        System.out.print(duplicated);
    }

    public void RemoveDuplicated2(char[] duplicated) {
        int currentInd=1;
        boolean unique[]= new boolean[256];

        for (int i=1;i<duplicated.length;i++) {
            int j;
            for( j=0;j<currentInd;j++){
                if(duplicated[i]==duplicated[j]) break;
            }
            if(j==currentInd) duplicated[currentInd++]=duplicated[i];
        }
        //System.out.println(duplicated.);

        System.out.print(duplicated);
    }

    public static void removeDuplicates(char[] str) {

        if (str == null) return;
        int len = str.length;
        if (len < 2) return;
        int tail = 1;
        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) break;
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
        }
        str[tail] = 0;
        System.out.println();
        System.out.println(str);
    }


    public static void ReplaceFun(char[] str, int length) {

        int spaceCount = 0, newLength, i = 0;

        for (i = 0; i < length; i++) {

            if (str[i] == ' ' ) {

                spaceCount++;

            }

        }

        newLength = length + spaceCount * 2;

        str[newLength] = '\0';

        for (i = length - 1; i >= 0; i--) {

            if (str[i] == ' ') {

                str[newLength - 1] = '0';

                str[newLength - 2] = '2';

                str[newLength - 3] = '%';

                newLength = newLength - 3;

            } else {

                str[newLength - 1] = str[i];

                newLength = newLength - 1;

            }

        }
        System.out.println(str);
    }


    public static void main(String ... args) {
        StringAndArrayManipulator sm=new StringAndArrayManipulator();
       // sm.RemoveDuplicated("abdcae".toCharArray());
        //System.out.println();
        sm.RemoveDuplicated("ednkdddenensnen".toCharArray());
        //System.out.println(sm.RemoveDuplicated("edeenn".toCharArray()));
        char[] ed="melaku".toCharArray();
       // System.out.println( sm.CstyleStringReversor2(ed));
         ReplaceFun("eden melaku mulugenta".toCharArray(),"eden melaku mulugenta".length());
        //sm.removeDuplicates(ed);
        //System.out.println(ed);


    }
}
