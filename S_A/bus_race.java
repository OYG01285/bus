package S_A;

import javax.lang.model.element.NestingKind;

public class bus_race extends bus {

    int now_passenger_num = 0;

    int inside_passenger = 0;

    String[] to_garage = {""};

    int total_cost = 0;

    public void bus_name_num(int e) {
        for (int i = 0; i < e; i++) {
            this.bus_num = i + 1;
            System.out.println(bus_num + "번 버스 객체 만들어짐");
        }
    }

    public int bus_name_select(int a) {
        bus_num = a;
        System.out.println(bus_num + "번 버스 객체를 사용합니다.");
        return bus_num;
    }


    public String situation(String a) {
        this.situation = a;
        if (gas <= 10) {
            situation = "차고지행";
            System.out.println("기름이 부족하여 차고지를 떠날 수 없습니다.");
        }else{
            if (situation.equals("차고지행")) {
                System.out.println("상태 = " + situation);
                System.out.println("주유량 = " + gas);
                now_passenger_num = 0;
            } else if (situation.equals("운행중")) {
                System.out.println("상태 = " + situation);
            }
        }
        return situation;
    }


    public int passenger_riding_num(int b) {
        if (situation.equals("운행중")) {
            if (now_passenger_num + b < this.max_passenger_num) {
                now_passenger_num += b;
                inside_passenger = max_passenger_num - now_passenger_num;
                System.out.println("탑승 승객 수 =" + b);
                System.out.println("잔여 승객 수 =" + (inside_passenger));
                System.out.println("요금 확인 =" + b * this.cost);
            } else if (now_passenger_num + b > this.max_passenger_num) {
                System.out.println("최대 승객 수 초과");
            }
        } else if (situation.equals("차고지행")) {
            System.out.println("차량 운행 중이 아닙니다");
        }
        return now_passenger_num;
    }

    public int passenger_quit_num(int b) {
        if (situation.equals("운행중")) {
            if (now_passenger_num - b > 0) {
                now_passenger_num -= b;
                inside_passenger = max_passenger_num - now_passenger_num;
                System.out.println("하차 승객 수 =" + b);
                System.out.println("잔여 승객 수 =" + (inside_passenger));
            } else if (now_passenger_num - b < 0) {
                System.out.println("내리는 사람이 타있는 사람보다 많은데 귀신이라도 내립니까?");
            }
        } else if (situation.equals("차고지행")) {
            System.out.println("차량 운행 중이 아닙니다");
        }
        return now_passenger_num;
    }

    public int gsa_Transition(int c) {
        if (situation.equals("차고지행")) {
            this.gas += c;
            System.out.println("주유량 = " + gas);
            System.out.println("상태 =" + situation);
        } else if (situation.equals("운행중")) {
            gas += c;
            System.out.println("주유량 = " + gas);
            if (gas < 10) {
                System.out.println("주유 필요");
                situation = "차고지행";
            }
        }
        return gas;
    }

    public int Speed(int d) {
        this.currentSpeed += d;
        return currentSpeed;
    }

    public int getTotal_cost(int a) {
        total_cost += cost;
        return total_cost;
    }
}



