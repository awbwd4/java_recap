package recap;

public class Ex13_11 {

    static long startTime = 0;

    public static void main(String[] args) {

        ThreadEx11_1 t1 = new ThreadEx11_1();
        ThreadEx11_2 t2 = new ThreadEx11_2();
        t1.start();
        t2.start();
        startTime = System.currentTimeMillis();

//        try {
////            t1.join();
////            t2.join();
//            //join : 메인스레드가 해당 스레드의 작업이 종료되길 기다린다.
//        } catch (InterruptedException e) {}

        System.out.println("소요시간 : "+(System.currentTimeMillis()-startTime));


    }
}

class ThreadEx11_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
//            System.out.print(this.getName()); //조상인 Thread 객체의 getName호출
            System.out.print("-");
        }
    }
}

class ThreadEx11_2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
//            System.out.print(Thread.currentThread().getName());
            System.out.print("|");
        }

    }
}