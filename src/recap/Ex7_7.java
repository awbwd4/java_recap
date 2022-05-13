package recap;

class Car{
    String color;
    int door;

    public Car() {
    }

    void drive() {
        System.out.println("car-drive");
    }
    void stop() {
        System.out.println("car-stop");
    }

}


class FireCar extends Car{

    public FireCar() {
        super();
    }

    void water(){
        System.out.println("firecar-water");
    }
}



public class Ex7_7 {

    public static void main(String[] args) {
        Car car = null;
        FireCar fc = new FireCar();
        FireCar fc2 = null;

        fc.water();
        car = fc;
//        car.water();
        fc2 = (FireCar) car;
//        fc2 = car;
        fc2.water();

        Car car2 = new Car();
        FireCar fc3 = (FireCar) car2;
        fc3.water();
        //실제로 생성된 객체는 Car()인데,
        // 해당 객체에는 water()가 없다.
    }




}
