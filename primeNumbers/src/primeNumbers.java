import java.util.Random;

public class primeNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            int value = random.nextInt(100);

            if (isPrime(value) && value != 0 && value != 1) {
                System.out.println("True ---> " + value);
            }


        }

    }

    private static boolean isPrime(int number){
        if (number != 2) {
            for (int i = number - 1; i > 1; i--) {

                if (number % i == 0) {
                    return false;
                }

            }
        }else{
            return false;
        }


        return true;
    }
}
