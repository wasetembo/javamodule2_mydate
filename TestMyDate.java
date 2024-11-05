public class TestMyDate {
    public static void main(String[] args) {
        // Create MyDate object for the current date
        MyDate currentDate = new MyDate();
        System.out.println("Current Date: ");
        System.out.println("Year: " + currentDate.getYear());
        System.out.println("Month: " + currentDate.getMonth());
        System.out.println("Day: " + currentDate.getDay());

        // Create MyDate object with specified elapsed time
        MyDate specificDate = new MyDate(34355555133101L);
        System.out.println("\nDate for 34355555133101 milliseconds since Jan 1, 1970:");
        System.out.println("Year: " + specificDate.getYear());
        System.out.println("Month: " + specificDate.getMonth());
        System.out.println("Day: " + specificDate.getDay());
    }
}
