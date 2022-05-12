package recap;

import java.util.Arrays;

public class Ex6_38 {

    static int[] arr = new int[10];

    static{ // 초기화 블럭을 통한 static 클래스 변수의 초기화
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 10)+1;
        }
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));


    }
}
