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
    }
}
