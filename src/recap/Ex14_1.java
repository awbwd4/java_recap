package recap;

@FunctionalInterface
interface MyFunction2{
    void run();
}



public class Ex14_1 {

    static void execute(MyFunction2 f){ //매개변수 타입이 MyFunction2인 메서드
        f.run();
    }

    static MyFunction2 getMyFunction2(){//반환 타입이 MyFunction2인 메서드
        MyFunction2 f = () -> System.out.println("f3.run()");
        return f;
    }


    public static void main(String[] args) {
        //람다식으로 MyFunction2의 run()구현
        MyFunction2 f1 = () -> System.out.println("f1.run()");

        //익명클래스로 run()을 구현
        MyFunction2 f2 = new MyFunction2() {
            @Override
            public void run() {
                System.out.println("f2.run");
            }
        };

        MyFunction2 f3 = getMyFunction2();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);

    }





}
