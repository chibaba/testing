public class Scope {

    //field that is accessible to all methods of the class
    private static int x = 1;

    //method main creates and initializes local variable x
    //and calls methods useLocalVariable and useFields

    public static void main(String[] args) {

        int x = 5; //method's local variable x shadows variable x

        System.out.printf("local x in main is %d%n", x);
        useLocalVariable(); // useLocalVariable has local x
        useField(); //useField uses class scope's field x
        useLocalVariable(); //useLocalVariabl reinitializes local x
        useField(); // class scope field x retains its value

        System.out.printf("%n local x in main is %d%n", x);
    }

        public static void useLocalVariable() {
            
        }
    
}