package recap;

class A {
    public void method(I i){
        i.method();
    }
}

interface I {
     void method();
}



class B implements I{
    public void method(){
        System.out.println("b 메서드");
    }
}
class C implements I{
    public void method(){
        System.out.println("c 메서드");
    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B()); //A가 B를 사용함(A가 B에 의존하고 있다)
        a.method(new C()); //A가 B를 사용함(A가 B에 의존하고 있다)



    }
}
