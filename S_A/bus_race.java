package S_A;

import javax.lang.model.element.NestingKind;

public class bus_race extends bus {

    int now_passenger_num = 0;

    int passengers_num = 0;

    String[] to_garage = {""};

    public void bus_name_num(int e) {
        for(int i =0; i < e ; i++) {
            this.bus_num = i+1;
            System.out.println( bus_num+"번 버스 객체 만들어짐");
        }
    }

    public String situation(String a) {
        this.situation = a;
        if (situation.equals("차고지행")) {
            System.out.println("주유량 =" + gas);
            now_passenger_num = 0;
        } else if(situation.equals("운행중")) {
            System.out.println("운행중");
        } else{
            System.out.println("다시 입력하세요");
        }
        return situation;
    }


    public int passenger_riding_num(int b) {
        if (situation.equals("운행중")) {
            if (now_passenger_num + b < this.max_passenger_num) {
                now_passenger_num += b;
                System.out.println("탑승 승객 수 =" + b);
                System.out.println("잔여 승객 수 =" + (max_passenger_num - now_passenger_num));
                System.out.println("요금 확인 =" + b * this.cost);
            } else if(now_passenger_num + b > this.max_passenger_num) {
                System.out.println("최대 승객 수 초과");
            }
        }else if(situation.equals("차고지행")){
            System.out.println("차량 운행 중이 아닙니다");
        }
        return now_passenger_num;
    }

    public int gsa_Transition(int c){
        if(situation.equals("차고지행")) {
            this.gas += c;
            System.out.println("주유량 = " + gas );
            System.out.println("상태 =" + situation);
        }else if(situation.equals("운행중")){
            gas += c;
            System.out.println("주유량 = " + gas );
            if(gas < 10){
                System.out.println("주유 필요");
                situation = "차고지행";
            }
        }
        return gas;
    }

    public int Speed (int d){
        this.currentSpeed += d;
        return currentSpeed;
    }

}

