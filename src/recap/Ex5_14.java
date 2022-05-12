package recap;

import java.util.Arrays;

public class Ex5_14 {
    public static void main(String[] args) {

        String str = "ABCDE";
        char ch = str.charAt(3);
        System.out.println(ch);
        System.out.println(str.substring(1, 4));



        char[] ch_array = str.toCharArray();
        for (int i = 0; i < ch_array.length; i++) {
            System.out.println(ch_array[i]);
        }
        System.out.println(Arrays.toString(ch_array));

    }
}
