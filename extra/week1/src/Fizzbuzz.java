public class Fizzbuzz {
    public static void main(String[] args) throws Exception {
        
        for(int num = 1; num < 101; num++){

            if (num % 3 == 0 && num % 5 == 0) {  // should be the first condition
                System.out.println("FizzBuzz"); // if kept last then no fizzbuzz, only fizz or buzz
            } else if (num % 5 == 0){
                System.out.println("Buzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else{
                System.out.println(num);
            }
        }
    }
}
