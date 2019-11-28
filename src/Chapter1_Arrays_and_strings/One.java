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

    public String RemoveDuplicated(char[] duplicated) {
        int currentInd=0;
        boolean unique[]= new boolean[256];
        for (int i=0;i<duplicated.length;i++) {
            if(unique[duplicated[i]]==false){
                unique[duplicated[i]]=true;
                duplicated[currentInd]=duplicated[i];
                currentInd++;
            }
        }
        //System.out.println(duplicated.);
        return duplicated.toString().substring(0,currentInd);
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
        duplicated[currentInd]=' ';
        System.out.print(duplicated);
    }
}
