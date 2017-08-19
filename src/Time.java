public class Time {
    public static void main(String[] args) {
        int hour, minute, second;
        hour = 17;
        minute = 20;
        second = 32;

        int numberOfSecondsSinceMidnight = hour * 60 * 60 + minute * 60 + second;
        int totalNumberOfSeconds = 24 * 60 * 60;
        double percentageOfDayPassed = 1.0 * numberOfSecondsSinceMidnight / totalNumberOfSeconds;

        System.out.println("Number of seconds since midnight: " + numberOfSecondsSinceMidnight);
        
        System.out.println("Percentage of day passed: " + percentageOfDayPassed * 100 + "%");
    }
}