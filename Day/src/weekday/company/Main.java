package weekday.company;


public class SwitchDemo {
    public static void main(String[] args) {

        int weekday = 7;
        String Saturday= "Sleep In";
        String Sunday= "Sleep In";
        String weekdayString;
        switch (weekday) {
            case 1:  weekdayString = "Saturday";
                break;
            case 2:  weekdayString = "Sunday";
                break;
            case 3:  weekdayString = "Monday";
                break;
            case 4:  weekdayString = "Tuesday";
                break;
            case 5:  weekdayString = "Wednsday";
                break;
            case 6:  weekdayString = "Thursday";
                break;
            case 7:  weekdayString = "Friday";
                break;
            default: weekdayString = "Invalid weekdays";
                break;
        }
        System.out.println(weekdayString);
    }
}