package ui;

import java.util.Scanner;

public class MainUI {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("按1，录入航班信息");
        System.out.print("按2，显示所有航班信息");
        System.out.print("按3，查询航班信息");
        System.out.print("按4，机票预定");
        System.out.print("按5，机票退订");
        System.out.print("按6，退出系统");
    }
    int choice=sc.nextInt();
    if(choice==1)
    {
        ystem.out.print("请输入机型：");
        String planeType = sc.next();
        System.out.print("请输入座位数：");
        int currentSeatsNum = sc.nextInt();
        System.out.print("请输入起飞机场：");
        String departureAirPort = sc.next();
        System.out.print("请输入目的机场：");
        String destinationAirPort = sc.next();
        System.out.print("请输入起飞时间：");
        String DepartureDate = sc.next();

        Flight flight = new Flight(id, fightId, planeType, currentSeatsNum,
                departureAirPort, destinationAirPort, departureAirPort);
        IFlightService iFlightService = new FlightServiceImpl();
        iFlightService.insertFlight(flight);
    }
}
