package recap;

class Product2{
    int price;
    int bonusPoint;

    public Product2(){}

    public Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv2 extends Product2{

    public Tv2() {
        super(100);
    }

    public String toString(){
        return "Tv";}
}


class Computer2 extends Product2 {

    public Computer2() {
        super(200);
    }

    public String toString(){
        return "Computer";}

}

class Audio extends Product2{

    public Audio() {
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product2 p){
        if (money < p.price){
            System.out.println("잔액 부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p.toString()+" 구입");
        System.out.println(p.toString()+" 구입");

    }

}


public class Ex7_29 {

    public static void main(String[] args) {

        Buyer b = new Buyer();

        b.buy(new Computer2());
        b.buy(new Computer2());
        b.buy(new Audio());
        b.buy(new Audio());
        b.buy(new Audio());

        System.out.println(b.money);


    }




}
