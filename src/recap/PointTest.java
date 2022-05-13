package recap;

class Point{
    int x;
    int y;

    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


class Point3D extends Point{

    int z;

    public Point3D(int x, int y, int z){
        super(x, y);
//        this.x = x;
//        this.y = y;
        this.z = z;
    }

}


public class PointTest {
}
