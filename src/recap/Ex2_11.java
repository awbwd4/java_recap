package recap;

public class Ex2_11 {
    public static void main(String[] args) {
        short sMin = -32768, sMax = 32767;
        //부호 있는 정수, 2byte, 16bit, 2^16 -> 숫자 65536까지
        char cMin = 0, cMax = 65535;
        //부호 있는 정수, 2byte, 16bit, 2^16 -> 숫자 65536까지
        // short : ~32768~32767
        // char : 0 ~ 65536


        System.out.println(sMin);
        System.out.println((short)(sMin-1));
        System.out.println(cMax);
        System.out.println((char)(cMax-1));


    }

}
