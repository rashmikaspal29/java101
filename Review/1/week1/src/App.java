public class App { //defines a class public= an access modifier(class can be used from anywhere)
    
    //main method = entry point of prgm, execution starts here
    //should always be public as jvm has to access this method from anywhere
    //static = method belongs to the class, not to an object.
            // can run main w0 creating an obj/instance of the class, aka App.
    //void = returns nothing
    //main = special name java searches to run or else program not run
    //String[] args = an array of Strings that holds command-line arguments.
                 //command line arguments: values passed to a program during execution through command prompt.
                 //https://www.geeksforgeeks.org/java/command-line-arguments-in-java/
    //throws exception: says method might generate and error, often replaced by try 
                       // and catch block

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        //prints the line
        //System: built in Java Class
        //out: static obj inside Systrem Class, represents std output(the console)
        //println = a method that prints text and moves the cursour to a next line
        
    }
}
/* 

to compile this program: 
        javac -d bin src/App.java

        Here: 

        javac = Java Compiler
        -d bin = destination directory for .class files(eg: App.class)
        src/App.java = src file to compile

        NOTE: If there's no bin in your file/ doesn't exist: dw
              JAVA WILL CREATE AUTOMATICALLY

to run: 

    java -cp bin App
     
    Here: 
        java: informing jvm to run the program

        -cp, called classpath

        -cp bin: check if there's .class files in bin folder

        App: name of the class
        
       */ 


