public class ShowCurrentTime {
    public static void main(String[] args) throws Exception {

        // obtain the total miliseconds since midnight since jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();


        //total seconds:
        long totalSeconds = totalMilliseconds / 1000;

         
        long currentSecond = (int) (totalSeconds % 60);

        //total minutes
        long totalMinutes = totalSeconds / 60;

        long currentMinute = (int) (totalMinutes % 60);

        //hours
        long totalHours = totalMinutes / 60;

        long currentHours = (int) (totalHours % 24);

        System.out.println("The current time is " + currentHours + ":" 
            + currentMinute + ":" + currentSecond + " GMT");

         
        
    }
}
