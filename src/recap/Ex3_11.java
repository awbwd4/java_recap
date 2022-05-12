package recap;

public class Ex3_11 {

    public static void main(String[] args) {

        double pi = 3.141592; //5에서 반올림 하고 싶을 경우
        double shorPi = Math.round(pi * 1000) / 1000.0;
        //Math.round함수는 소숫점 첫째에서만 반올림 하도록 되어있다.
        System.out.println(pi);
        System.out.println(shorPi);


        //3.141까지만 출력하려면?
        System.out.println(pi*1000); //3141.592
        System.out.println((int)(pi*1000)); //3141
        System.out.println((int)(pi*1000)/1000.0); //3.141


    }

}
