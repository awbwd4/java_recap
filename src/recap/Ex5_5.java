package recap;

import java.util.Arrays;

public class Ex5_5 {
    public static void main(String[] args) {

        int[] arr = new int[45];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));

        int tmp = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            j = (int) (Math.random() * 45);
            tmp = arr[j];
            arr[j] = arr[0];
            arr[0] = tmp;
            System.out.println(arr[0]);
        }

        System.out.println(Arrays.toString(arr));

    }
}
