public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int lastDigit = 0;
        int parameter = number;

        while (Math.abs(parameter) > 0){
            lastDigit = parameter % 10;
            reverse = (reverse * 10) + lastDigit;

            parameter = parameter / 10;
        }


        if (number == reverse){
            return true;
        }else {
            return false;
        }
    }
}
