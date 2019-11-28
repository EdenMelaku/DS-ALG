package Chapter1_Arrays_and_strings;


public class test {

    public static void main(String ... args) {
        String characters="eden";
        StringAndArrayManipulator manipulator=new StringAndArrayManipulator();
        //System.out.println(manipulator.has_all_unique(characters));
        String word="eden\n";
       // System.out.println(manipulator.CstyleStringReversor(word));
        char name[]={'e','d','e','n','d','v','j','f','e'};
        //System.out.println(manipulator.RemoveDuplicated(name));
        manipulator.RemoveDuplicated1(name);

    }
}
