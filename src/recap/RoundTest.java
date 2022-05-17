package recap;

import java.util.ArrayList;

public class RoundTest {

    public static void main(String[] args) {
        int i = Integer.parseInt("100");
        System.out.println(Integer.parseInt("100"));
        System.out.println(Integer.parseInt("100",10));
        System.out.println(Integer.parseInt("100",2));
        System.out.println(Integer.parseInt("FF",16)); //16진수

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(100)); //정석적인 방법
        list.add(100); //컴파일러가 이렇게만 해도 알아서 오토박싱 후 배열에 넣어줌

        int j = list.get(0).intValue();
        System.out.println(j);
    }

}
