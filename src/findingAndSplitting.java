import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class findingAndSplitting {

    static void testInput() {
        String input = "hoopa";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        testInput();
        Scanner sc = new Scanner(System.in);

        String str =sc.nextLine();

        String result="";

        for (int i = 0; i < str.length(); i++) {
            int j = i;
            while(j < str.length() && str.charAt(j) == str.charAt(i)) {
                j++;
            }


            if(j - i > result.length()) {
                result = str.substring(i, j);
            }
        }
        System.out.println(result);
    }

}