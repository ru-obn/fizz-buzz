public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz = " + i);
            }
            if (i % 5 == 0) {
                System.out.println("buzz = " + i);
            }
            if (i % 15 == 0){
                System.out.println("FizzBuzz = " + i);
            }
        }
    }
}
