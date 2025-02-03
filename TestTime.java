public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display time before change
        System.out.println("Initial Time:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);

        // Modify the times
        t1.nextSecond();   // Advance t1 by 1 second
        t2.previousSecond(); // Move t2 back by 1 second

        // Display final time after modifications
        System.out.println("\nAfter modification:");
        System.out.println("t1 (after nextSecond): " + t1);
        System.out.println("t2 (after previousSecond): " + t2);
    }
}
