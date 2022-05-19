package recap;

public class Ex13_1 {

    public static void main(String[] args) {

        ThreadEx1_1 t1 = new ThreadEx1_1();


        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        //스레드를 생성한 뒤에 start를 호출해야 스레드가 작업을 한다.
        t1.start();
        t2.start();
//
//
////        System.out.println("=============================");

//        //싱글스레드
//        for (int i = 0; i < 500; i++) {
////            System.out.print(this.getName());
//            System.out.print(0);
//        }
//
//        for (int i = 0; i < 500; i++) {
////            System.out.print(Thread.currentThread().getName());
//            System.out.print(1);
//        }

        //위 두개의 작업은 겹치지 않는다. 싱글스레드에서는 하나의 작업이 끝나야 다른 작업이 진행되기 때문.


    }

}


class ThreadEx1_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
//            System.out.print(this.getName()); //조상인 Thread 객체의 getName호출
            System.out.print(0);
        }
    }
}

class ThreadEx1_2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
//            System.out.print(Thread.currentThread().getName());
            System.out.print(1);
        }

    }
}