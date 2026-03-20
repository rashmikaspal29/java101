public class Area {
 
    public static void main(String[] args) throws Exception {
        
        final double PI = 3.14159;
        double radius = 5.0;
        double area = PI * Math.pow(radius, 2);

        System.out.printf("The area of the circle is: %.2f", area);
    }
}
