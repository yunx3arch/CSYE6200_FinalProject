package com.company;

//The boat class contains boats information and 2 methods.
public class Boat {

    private String boat;
    private int position1;//The horizontal coordinate of the boat.
    private int position2;//The vertical coordinate of the boat.
    private double heading;//The heading angle of the boat.
    private double speed;//The speed of the boat.
    private double loadCapacity;//The load capacity/usage, in KG.
    private double batteryCapacity;//The battery capacity/usage.

//A constructor that sets information of boats.
    Boat(int p1, int p2, double lc, double bc, double hd, double sp) {
        position1 = p1;
        position2 = p2;
        loadCapacity = lc;
        batteryCapacity = bc;
        heading = hd;
        speed = sp;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "position1=" + position1 +
                ", position2=" + position2 +
                ", heading=" + heading +
                ", speed=" + speed +
                ", loadCapacity=" + loadCapacity +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }

    public int getPosition1() {
        return position1;
    }

    public void setPosition(int position1) {
        this.position1 = position1;
    }
    public int getPosition2() {
        return position2;
    }

    public void setPosition2(int position2) {
        this.position2 = position2;
    }

    public double getHeading() {
        return heading;
    }

    public void setHeading(double heading) {
        this.heading = heading;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

     //The moveTo method prints the cell boundary transition.
     public void moveTo(Boat boat) {

        if (heading >= 0 & heading < 90) {
            double NE = Math.toRadians(heading);
            System.out.println("The boat goes" + Math.sin(NE) * speed + "miles east, and " + Math.cos(NE) * speed + "miles north.");
        } else if (heading >= 90 & heading < 180) {
            double NW = Math.toRadians(heading - 90);
            System.out.println("The boat goes" + Math.sin(NW) * speed + "miles west, and " + Math.cos(NW) * speed + "miles north.");
        } else if (heading >= 180 & heading < 270) {
            double SW = Math.toRadians(heading - 180);
            System.out.println("The boat goes" + Math.sin(SW) * speed + "miles south, and " + Math.cos(SW) * speed + "miles west.");
        } else if (heading >= 270 & heading < 360) {
            double SE = Math.toRadians(heading - 270);
            System.out.println("The boat goes" + Math.sin(SE) * speed + "miles east, and " + Math.cos(SE) * speed + "miles south.");
        } else {
            System.out.println("Invalid heading.");
        }
    }
    //The boatInfo method prints the information of each boat.
     public static void boatInfo(Boat boat) {
        System.out.println("--------Boat Information--------");
        System.out.println("Boat Position: " + boat.position1+", "+ boat.position2);
        System.out.println("Load Capacity: " + boat.loadCapacity);
        System.out.println("Battery Capacity: " + boat.batteryCapacity);
        System.out.println("Heading: " + boat.heading);
        System.out.println("Speed: " + boat.speed);
     }



}
