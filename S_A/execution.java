package S_A;
import java.util.Scanner;

public class execution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bus_race bus = new bus_race();


        System.out.println("버스의 수량을 입력하세요");
        int a = sc.nextInt();
        bus.bus_name_num(a);    // 버스 번호 생성
        System.out.println();

        System.out.println("정보를 입력할 버스 번호를 선택하세요");
        int f = sc.nextInt();
        bus.bus_name_select(f);
        System.out.println();


        for(int b = 0; b <= 4;){
            System.out.println("원하시는 실행을 선택하세요");
            System.out.println("1. 승객 관련");
            System.out.println("2. 버스 위치 관련");
            System.out.println("3. 기름 관련");
            System.out.println("4. 종료");
            b = sc.nextInt();

            if(b == 1) {
                for(int g = 1 ;g < 2;){
                    System.out.println("원하시는 승하차를 선택하세요");
                    System.out.println("1.승차");
                    System.out.println("2.하차");
                    g = sc.nextInt();
                        if(g == 1) {
                            System.out.println("승객 수를 입력하세요");
                            int c = sc.nextInt();
                            bus.passenger_riding_num(c);
                            System.out.println();
                            break;
                        }else if(g == 2) {
                            System.out.println("승객 수를 입력하세요");
                            int h = sc.nextInt();
                            bus.passenger_quit_num(h);
                            System.out.println();
                            break;
                            }
                        }
            }else if(b == 2 ) {
                for(int k = 1; k < 3;){
                    System.out.println("버스 위치를 입력하세요");
                    System.out.println("1. 운행중");
                    System.out.println("2. 차고지행");
                    k = sc.nextInt();
                        if (k == 1 ) {
                            bus.situation("운행중");
                            System.out.println();
                            break;
                        }else if(k == 2 ) {
                            bus.situation("차고지행");
                            System.out.println();
                            break;
                    }
                }

            }else if(b == 3) {
                System.out.println("기름의 변화를 입력하세요");
                int e = sc.nextInt();
                bus.gsa_Transition(e);
                System.out.println();

            }else if(b == 4){
                System.out.println("종료 합니다.");
                return;
            }
        }
    }
}
