
public class Example01 {

    public static void main(String[] args) {
        // 변수 선언 후 초기화
        int days;
        days = 10;
        System.out.println(days);

        int speed = 20;
        System.out.println(speed);

        // 상수 선언 후 초기화
        final int TIME = 100;
        System.out.println("Final time is ");
        System.out.println(TIME);

        days = 30;
        speed = 200;
        // TIME = 10;

        System.out.println("New days, new speed, new time: ");
        System.out.println(days);
        System.out.println(speed);
        System.out.println(TIME);
    }

}