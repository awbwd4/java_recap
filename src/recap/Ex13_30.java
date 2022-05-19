package recap;

public class Ex13_30 {

    public static void main(String[] args) {
        Runnable r = new RunnableEx22();
        new Thread(r).start();
        new Thread(r).start();
    }

}

class Account2{
    private int balnace = 1000; //private으로 해야 동기화 한 의미가 있음.

    public int getBalnace() {
        return balnace;
    }

    public synchronized void withdraw(int money) {//synchronized로 메서드 동기화
        if (balnace >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            balnace -= money;
        }
    }
}


class RunnableEx22 implements Runnable {

    Account2 acc2 = new Account2();

    @Override
    public void run() {
        while (acc2.getBalnace() > 1){
            // 100, 200, 300 중 한 값을 임의로 선택해서 출금
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc2.withdraw(money);
            System.out.println("balance : "+acc2.getBalnace());
        }
    }
}