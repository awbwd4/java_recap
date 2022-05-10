package recap;

public class Ex3_9 {

    public static void main(String[] args) {

        // 연산 전에 피연산자의 타입을 일치시킴
        // 1. 두 피연산자의 타입을 같게 일치시킴
        // 2. 피연산자의 타입이 int 보다 작은 타입이면 int로 변환한 뒤에 연산한다.
        System.out.println('2'-'0');//'2'의 유니코드 값은 50, '0'의 유니코드 값은 48 따라서 문자가 아닌 숫자 2가 반환된다.


        int a = 1000000;
        int b = 2000000;

        long c = a * b; //long 변수에 담으려 했지만 int끼리 연산을 했을 때 이미 오버플로우가 발생했음
        System.out.println(c);

        long d = (long) a * b;
        System.out.println(d);



    }

}
