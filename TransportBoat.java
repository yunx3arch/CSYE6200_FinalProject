package com.company;

public class TransportBoat extends Boat {
    TransportBoat(int p1, int p2, double lc, double bc, double hd, double sp) {
        super(p1, p2, lc, bc, hd, sp);
    }
    double cargoHeight;
    double cargoLength;
    public static double calculateArea(double cargoHeight, double cargoLength) {
        return cargoHeight*cargoLength;
    }
    public static void printBoatInfo(){
        Boat boat1 = new Boat(6, 9, 2, 3, 89, 2);
        Boat boat2 = new Boat(2, 6, 4, 6, 178, 4);
        Boat boat3 = new Boat(1, 4, 6, 4, 268, 1);
        Boat boat4 = new Boat(3, 1, 4, 3, 34, 2);
        Boat boat5 = new Boat(3, 2, 2, 3, 45, 2);
        boatInfo(boat1);
        System.out.println("Cargo Area: " + calculateArea(3.5,2.5));
    }
    public static void main(String[] args){
        printBoatInfo();
    }

}