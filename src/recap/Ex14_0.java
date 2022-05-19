package recap;

public class Ex14_0 {
    public static void main(String[] args) {
//        Object obj = (a,b)-> a > b ? a : b;
        MyFunction f = new MyFunction(){
            public int max(int a, int b){
                return a>b ? a:b;
            }
        };

        //람다식(익명객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction f2 = (a,b)->a>b ? a:b;


        int value = f.max(3, 5);
        int value2 = f2.max(3, 5);
        System.out.println(value);
        System.out.println(value2);
    }
}


@FunctionalInterface
interface MyFunction{
    int max(int a, int b );
//    public abstract int max2(int a, int b);//함수형 인터페이스는 단 하나의 추상 메서드만 갖는다.
}