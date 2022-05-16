package recap;

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("stop");
    }
}

interface Fightable {
    void move(int x, int y);
    //생략돼있지만 접근제어자는 public임

    void attack(Fightable fightable);
}

class Fighter extends Unit implements Fightable {

    //오버라이딩 규칙 : 조상보다 접근제어자의 범위가 좁을 수 없다.
    @Override
    public void move(int x, int y) {
        System.out.println("["+x+","+y+"]로 이동");
    }

    @Override
    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    }

    Fightable getFighter(){
        Fighter f  =  new Fighter();
//        return (Fightable) f;
        return f;
    }
}


public class FighterTest {

    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fightable f2 = f.getFighter();
    }
}
