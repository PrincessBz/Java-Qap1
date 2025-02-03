public class TestDate {
    public static void main(String[] args) {
        // Creating a Date object using the parameterized constructor
        Date date = new Date(5, 3, 2024);

        // Printing the date using toString()
        System.out.println("Initial Date: " + date);

        // Updating the date using setters
        date.setDay(25);
        date.setMonth(12);
        date.setYear(2025);

        // Printing the updated date
        System.out.println("Updated Date: " + date);
    }
}
