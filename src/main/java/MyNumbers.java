import java.util.Arrays;

public class MyNumbers {

    public static void main(String[] args) {
        int[] myNumbers = {1,2};
        System.out.println(Arrays.toString(myNumbers));
        int temp = myNumbers[0];
        myNumbers[0] = myNumbers[1];
        myNumbers[1] = temp;
        System.out.println(Arrays.toString(myNumbers));


    }

}


