package com.cinema;

import java.util.Scanner;

public class CinemaApp {
    public static void main(String[] args) {

        SeatManager sm = new SeatManager();
        Scanner sc = new Scanner(System.in);

        //进入购票
        while (true) {
            sm.drawSeat();
            System.out.println("\n请输入您想选择的座位的行数字（输入-1退出）：");

            if (!sc.hasNextInt()) {
                System.out.println("输入错误！请重新输入！");
                //清除错误输入
                sc.nextLine();
                continue;
            }

            int row = sc.nextInt();

            if (row == -1) break;

            System.out.println("\n请输入您想选择的座位的列数字（输入-1退出）：");

            if (!sc.hasNextInt()) {
                System.out.println("输入错误！请重新输入!");
                //清除错误输入
                sc.nextLine();
                continue;
            }

            int col = sc.nextInt();

            if (col == -1) break;

            sm.buyTicket(row, col);

        }
        sc.close();
    }
}
