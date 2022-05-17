package recap;

import java.util.ArrayList;

public class GenericTest {

    public static void main(String[] args) {

//        ArrayList list = new ArrayList();
        ArrayList<Integer> list = new ArrayList();


        list.add(10);
        list.add(10);
        list.add(10);
//        list.add("10"); 타입 체크 강화


        Integer i = list.get(3);
//        Integer i = (Integer) list.get(2);
        System.out.println(i);

    }

}
