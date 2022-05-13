package recap;

class MyPoint{

    int x;
    int y;


    public MyPoint(){}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        //Object의 toString을 오버라이딩함.

        return "x : " + x + " y : " + y ;
    }


}




public class OverrideTest {

    public static void main(String[] args) {

        MyPoint m = new MyPoint(3, 5);//
//        m.x = 3;
//        m.y = 2;

        System.out.println(m);
        //println은 내부에서 toString을 호출함.
        //System.out.println(m.toString); 과 같음

    }





}
