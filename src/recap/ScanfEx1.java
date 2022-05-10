package recap;
import java.util.Scanner;

public class ScanfEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//system.in : 화면에서 값을 입력받는다는 뜻

//        int num = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println(num);
//        System.out.println(num2);
//
        String input = scanner.nextLine();//숫자나 문자열, 실수등이 섞여 있을 때 라인으로 받는다.
        int num = Integer.parseInt(input);

        System.out.println(num);


    }

}
