public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
                
            }
        }
        System.out.println("");
        printNumbers(1,1000);

    }
    public static void printNumbers(int start, int end){

        for(int j = start; j <= end; j++){
            System.out.println(j);
        }
    }
}