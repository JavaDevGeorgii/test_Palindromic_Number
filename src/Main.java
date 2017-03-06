public class Main {
    public static void main(String[] args) {
        int secondNumber, firsNumber, maxFN, maxSN, maxPalindrome;
        firsNumber = 999;
        maxPalindrome = 0;
        maxFN = 0;
        maxSN = 0;
        do {
            secondNumber = firsNumber;
            do {
                if (reverse(firsNumber * secondNumber)) {
                    if (maxPalindrome < (firsNumber * secondNumber)) {
                        maxPalindrome = firsNumber * secondNumber;
                        maxFN = firsNumber;
                        maxSN = secondNumber;
                    }
                    break;
                } else {
                    secondNumber--;
                }
            } while ((secondNumber / 100) > 0);
            firsNumber--;
        } while ((firsNumber / 100) > 0);

        System.out.println("First number: " + maxFN + "\tSecond number: " + maxSN +
                "\t| palindrome is: " + maxPalindrome);
    }

    public static boolean reverse(int num) {
        String str = String.valueOf(num);
        int lng = str.length();
        int pos = 0;
        while (pos <= (lng - 1) / 2) {
            if (str.charAt(pos) == str.charAt(lng - 1 - pos)) {
                pos++;
            } else
                return false;
        }
        return true;
    }

}

