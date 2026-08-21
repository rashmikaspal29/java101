public class SumApp {
    public static void main(String[] args) throws Exception {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        int val3 = Integer.parseInt(args[2]);

        int total = val1 + val2 + val3;

        System.out.println("Total = " + total);
       
    }
}
/*
the command should be :

java -cp bin SumApp 5 10 15

here,
1. java = command
2. -cp = classpath, after this there should always be the location of class, i.e, .class
3. bin = this is the location of the class we were talking about, .class
4. SumApp = the class name
5. 5, 10, 15 = arguments that are being passed into the main method by Java
*/
