package recap;

public class Ex3_7 {

    public static void main(String[] args) {
        byte b = 100; //byte의 범위 안임 -128 ~ 127
        //형변환을 직접 안해줘도 됨. 리터럴 즉 상수값을 변수에 직접 대입하는건 할필요 없음

        int i = 100;
//        byte c = i;//에러남. 값을 직접 넣어주는 것이 아니라 참조하는 것이기 때문 이경우는 캐스팅을 해줘야함
        byte c = (byte) i;

//        byte d = 1000; //리터럴이지만 byte의 범위를 넘은 값임
        byte d = (byte) 1000; // 직접 형변환 해줘야함. 값손실 있음

        System.out.println(d);
    }
}
