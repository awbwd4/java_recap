package recap;

public class Ex2_12 {
    public static void main(String[] args) {
        String str = "3";

        System.out.println("3".charAt(0) - '0');
        System.out.println('3'-'0' +1); // 문자'3'에서 '0'을 빼면 숫자 3
        System.out.println("3"+1); //문자열에다 숫자를 더하면 문자열을 반환함
        System.out.println(3+'0'); // 0은 숫자로 48임. +'0'을 하면 알아서 숫자로 반환해
        System.out.println('0'+3); // 0은 숫자로 48임. +'0'을 하면 알아서 숫자로 반환해
        System.out.println((char) (3+'0'));


    }
}
