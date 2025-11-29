package FourthArray;

public class SecondLargest {
    public static int largestNo(int[] number){
        int largest = 0;
        for(int i =0;i<number.length;i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = { 2,4,3,8,1,3,6};
        System.out.println(largestNo(numbers));


    }
}
