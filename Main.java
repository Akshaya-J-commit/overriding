package com.hcl2;

import java.util.Scanner;

class Event {
    String name;
    String detail;
    String ownerName;

    class Event(String name, String detail,String ownerName)

    {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double projectRevenue() {
        return (0.00);
    }
}
class Exhibition extends Event{
 int noOfStall;
 public Exhibition(int noOfStall){
     this.noOfStall=noOfStall;
 }

    public void setNoOfStall(int noOfStall) {
        this.noOfStall = noOfStall;
    }

    public int getNoOfStall() {
        return noOfStall;
    }
    public  double projectRevenue(){
     double revenue=noOfStall*10000;
     return(revenue);
 }
}


class StageEvent extends Event{
    int noOfSeats;
    int noOfSeatsPerShow;
    public StageEvent(int noOfSeats,int noOfSeatsPerShow)
    {
        this.noOfSeats=noOfSeats;
        this.noOfSeatsPerShow=noOfSeatsPerShow;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }

    public int getNoOfSeatsPerShow() {
        return noOfSeatsPerShow;
    }
    public double projectRevenue(){
        double revenue=noOfSeats*noOfSeatsPerShow*100;
        return(revenue);
    }
}
}
public class Main {

    public static void main(String[] args) {
        int n,noOfStall,noOfSeats,noOfSeatsPerShow;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the name of the event:");
        String name=in.nextLine();
        System.out.println("enter the details of the event:");
        String details=in.nextLine();
        System.out.println("enter the owner name of the event:");
        String ownername=in.nextLine();
        System.out.println("enter the type of event:");
        System.out.println("1.Exhibition");
        System.out.println("2.StageEvent");
        n=in.nextInt();
        if(n==1)
        {
            System.out.println("enter the number of stalls:");
            noOfStall=in.nextInt();
            Event eve=new Exhibition(name,details,ownername,noOfStall);
            System.out.println("the projected revenue is:"+eve.projectRevenue());

    }
        else
        {
            System.out.println("enter the number of seats:");
            noOfSeats=in.nextInt();
            System.out.println("enter the number of seats per show:");
            noOfSeatsPerShow=in.nextInt();
            Event eve=new Exhibition(name,details,ownername,noOfSeats,noOfSeatsPerShow);
            System.out.println("the projected revenue is:"+eve.projectRevenue());
        }
}
