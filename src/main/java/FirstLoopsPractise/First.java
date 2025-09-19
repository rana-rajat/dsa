package FirstLoopsPractise;


public class First {
    //Reverse of a number same string also
    public static void main(String[] args) {
        int numb = 1234;
        String string = String.valueOf(numb);
        String[] numberArray = string.split("");
        int start = 0;
        int end = numberArray.length - 1;
        while (start < end) {
            String temp = numberArray[start];
            numberArray[start] = numberArray[end];
            numberArray[end] = temp;
            start++;
            end--;
        }
        String join = String.join("", numberArray);
        int i = Integer.parseInt(join);
        System.out.println(i);

        //Above do for String only use the below method to reverse a number
        int num = 5678;
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }
        System.out.println();

        //below we don't directly print instead we will save it into a variable
        int newNumber = 45678;
        int reversedNumber = 0;

        while (newNumber > 0) {
            int lastdigit = newNumber % 10;
            reversedNumber = (reversedNumber * 10) + lastdigit;
            newNumber = newNumber / 10;
        }
        System.out.println(reversedNumber);
    }
}
