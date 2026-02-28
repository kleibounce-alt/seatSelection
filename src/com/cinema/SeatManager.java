package com.cinema;

public class SeatManager {
    /*
     用static使得row和col可以在全局使用
     final代表值不可更改。
    */
    private static final int row = 8;
    private static final int col = 10;

    private int[][] seats = new int[row][col];

    //空参构造
    public SeatManager() {}

    //画电影院座位示意图
    public void drawSeat () {
        System.out.println("-------------QG工作室-------------");
        System.out.print("    ");
        //打印列号
        for (int c = 1; c <= col; c++) {
            System.out.printf("%2d ", c);
        }
        System.out.println();

        //打印行及其座位图
        for (int r = 1; r <= row; r++) {
            System.out.print(r + "  ");
            for (int n = 1; n <= 10; n++) {
                if (seats[r - 1][n - 1] == 0) {
                    System.out.print("[ ]");
                }
                else {
                    System.out.print("[x]");
                }
            }
            System.out.println();
        }

        System.out.println("---------------------------------");
    }

    //购票方法
    public boolean buyTicket (int r, int c) {
        if (r <= 0 || r > row || c <= 0 || c > col) {
            System.out.println("座位不存在");
            return false;
        }

        if (seats[r][c] == 0) {
            seats[r][c] = 1;
            System.out.println("购票成功！");
            return true;
        }
        else {
            System.out.println("座位已被选择！");
            return false;
        }
    }
}
