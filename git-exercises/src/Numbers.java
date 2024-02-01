public class Numbers {
    public void numbersOneToOnehundred() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 * i == 0 && i % 5 * i == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}