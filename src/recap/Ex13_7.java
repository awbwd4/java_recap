package recap;

import java.util.TreeMap;

public class Ex13_7 implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new Ex13_7());
//        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10 ; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(i);

            if(i==5){autoSave = true;}; //데몬 스레드 시작
        }
        System.out.println("시스템 종료");

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);//3초마다 슬립
            } catch (InterruptedException e) {}
            if (autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("자동저장됨.");
    }


}
