package S_A;
import java.util.Scanner;

public class execution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bus_race bus = new bus_race();


        System.out.println("버스의 수량을 입력하세요");
        int a = sc.nextInt();
        bus.bus_name_num(a);    // 버스 번호 생성



        for(int b = 0; b <= 4;){
            System.out.println("원하시는 실행을 선택하세요");
            System.out.println("1. 승객 관련");
            System.out.println("2. 버스 위치 관련");
            System.out.println("3. 기름 관련");
            System.out.println("4. 종료");
            b = sc.nextInt();

            if(b == 1) {
                System.out.println("승객 수를 입력하세요");
                int c = sc.nextInt();
                bus.passenger_riding_num(c);
            }else if(b == 2 ) {
                System.out.println("버스 위치를 입력하세요");
                String d = sc.next();
                bus.situation(d);
            }else if(b == 3) {
                System.out.println("기름의 변화를 입력하세요");
                int e = sc.nextInt();
                bus.gsa_Transition(e);
            }else if(b == 4){
                System.out.println("종료 합니다.");
            }
        }
    }
}
