package recap;

import java.util.Arrays;

public class Ex5_4 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int n = (int) (Math.random() * 10);
            int temp = arr[0];
            arr[0] = arr[n];
            arr[n] = temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println((int)(Math.random()*10));

    }
}
