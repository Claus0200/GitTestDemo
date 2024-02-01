public class Numbers {
    public void numberOneToOnehundred() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 * i == 0 && i % 5 * i == 0) {
                System.out.println("Buzz");
            }
        }
    }
}