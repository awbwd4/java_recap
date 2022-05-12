package recap;

public class Ex4_19 {

    public static void main(String[] args) {
        Loop1 :for (int i = 2; i <=9; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.println(j);
                if (j == 5){
                    break Loop1;
                    //break는 가장 가까운 반복문을 탈출하는것만 가능하지만
                    //반복문에 이름을 붙인 뒤 해당 반복문을 탈출하도록 하면
                    // 중첩 반복문도 한번에 탈출이 가능하다.}
                }
            }
        }
    }
}
