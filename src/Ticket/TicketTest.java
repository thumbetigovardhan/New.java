package Ticket;

import java.util.Date;

public class TicketTest {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        t1.name="MOVIE_name";
        t1.date=new Date();
        t1.row="A";
        t1.seat_no=new int[5];
        t1.seat_no[0]=12;
        System.out.println("MOVIE_NAME:"+t1.name);
        System.out.println("DATE:"+t1.date);
        System.out.println("ROW:"+t1.row);
        System.out.println("SEAT_NUMBER[]:"+t1.seat_no);
    }

}
