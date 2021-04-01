package com.company;


public class BoatTest {

    //There are 5 instances of boats.
    public static void run() {
        Boat boat1 = new Boat(6, 9, 2, 3, 89, 2);
        Boat boat2 = new Boat(2, 6, 4, 6, 178, 4);
        Boat boat3 = new Boat(1, 4, 6, 4, 268, 1);
        Boat boat4 = new Boat(3, 1, 4, 3, 34, 2);
        Boat boat5 = new Boat(3, 2, 2, 3, 45, 2);
        boat1.moveTo(boat1);
    //Use boatInfo method to print the information of 5 boats.
        boat1.boatInfo(boat1);
        boat2.boatInfo(boat2);
        boat3.boatInfo(boat3);
        boat4.boatInfo(boat4);
        boat5.boatInfo(boat5);



    }
    public static void main(String[] args){
        run();
    }




}
