package recap;

import java.util.ArrayList;
import java.util.List;

class Product{}

class Tv4 extends Product { }
class Audio4 extends Product { }

public class Ex12_1 {

    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv4> tv4s = new ArrayList<Tv4>();
        ArrayList<Audio4> audio4s = new ArrayList<Audio4>();
        List<Tv4> tv4List = new ArrayList<Tv4>();

        productList.add(new Tv4());
        productList.add(new Audio4());

//        tv4s.add(new Audio4());
        tv4s.add(new Tv4());

        printAll(productList);



    }

    public static void printAll(ArrayList<Product> list) {
            for(Product p : list){
                System.out.println(p);
            }
    }




}
