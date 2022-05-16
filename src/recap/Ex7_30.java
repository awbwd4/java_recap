package recap;

class Product1{
    int price;
    int bonusPoint;

    public Product1(){}

    public Product1(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product1{

    public Tv1() {
        super(100);
    }

    public String toString(){
        return "Tv";}
}


class Computer1 extends Product1 {

    public Computer1() {
        super(200);
    }

    public String toString(){
        return "Computer";}

}

class Audio1 extends Product1{

    public Audio1() {
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}

class Buyer1 {
    int money = 1000;
    int bonusPoint = 0;
    Product1[] cart = new Product1[10];//제품 배열
    int i = 0;


    void buy(Product1 p){
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p.toString()+"  구입");
    }

    void summary() { //구입 내역 요약
        int sum = 0;
        String itemList = ""; //구입 내역

        for (int i = 0; i < 10; i++) {
            if(cart[i]==null) break;
            sum += cart[i].price;
            itemList += cart[i] + " , ";
        }
        System.out.println("구입액 "+ sum);
        System.out.println("구입내역 "+ itemList);

    }


}


public class Ex7_30 {

    public static void main(String[] args) {

        Buyer1 b = new Buyer1();


        b.buy(new Audio1());
        b.buy(new Computer1());
        b.buy(new Tv1());

        b.summary();

    }


}
