package FourthArray;


public class FirstInputOutput {
    public static int findings(String[] yhe, String name ){
        for(int i = 0 ; i < yhe.length; i ++ ){
            if(yhe[i].equals(name)){
                return i;
            }
        }return 0;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        String[] str = {"Ram","Shyam","Lilu","ritesh"};
        String name = "ritesh";
        System.out.println(findings(str,name));
    }
}
