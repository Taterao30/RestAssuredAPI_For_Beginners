package Java_Programs;

public class Test2_ReverseNumber {

    public static void main(String[] args) {

        int no = 12345;
        int reverse = 0;

        while (no != 0) {

            int digit = no % 10;          // Extract last digit
            reverse = reverse * 10 + digit;
            no = no / 10;                 // Remove last digit
        }

        System.out.println("Reverse Number = " + reverse);
    }
}