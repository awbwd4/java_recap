package recap;

public class Ex3_2 {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        while(i < 4){
            i++;
        }
        while(j < 4){
            ++j;
        }
        System.out.println(i);
        System.out.println(j);

        int k = 0;
        int l = 0;
        int k1 = ++k; //k에 1이 증가된 뒤에 k1에 참조됨
        int l1 = l++; //l이 l1에 참조된 뒤에 l이 1 증가됨
        System.out.println(k1);
        System.out.println(l1);
        System.out.println(k);
        System.out.println(l);
    }

}
