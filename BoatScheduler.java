package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class BoatScheduler {
    private static ArrayList<BoatTask> boatTasks = new ArrayList<>();
    private static Map<String, BoatTask> map = new HashMap<>();

    //a method to add task.
    private static void addBoatTask(BoatTask boatTask) {
        boatTasks.add(boatTask);
    }

    //a method to delete task.
    private static void deleteBoatTask(BoatTask boatTask) {
        if (!boatTasks.isEmpty()) {
            boatTasks.remove(boatTask);
        }
    }

    //a method to retrieve task.
    private static BoatTask getBoatTask(String BoatID) {
        for (BoatTask boatTask : boatTasks) {
            if (boatTask.getBoatID() == BoatID) {
                return boatTask;
            }
        }
        return null;
    }

    //to print out the current task(s).
    private static void printBoatTask() {
        for (BoatTask boatTask : boatTasks) {
            System.out.println("---------------Current Task(s)-----------------");
            System.out.println(boatTask.toString());

        }
    }

    //to search through the map.
    private static void searchMap(String boatID) {
        System.out.println("-----------Task(s) under the boat ID--------------");
        System.out.println(map.get(boatID));
        System.out.println("-----------------------END------------------------");
    }
    // some task instances.
    public static void main(String[] args){
        BoatTask boatTask1 = new BoatTask(1,"cleaning", "garbage", "20200714","01");
        BoatTask boatTask2 = new BoatTask(2,"returning", "dock", "20200714","02");
        BoatTask boatTask3 = new BoatTask(3,"heading", "target site", "20200714","01");

    //test.
        addBoatTask(boatTask1);
        addBoatTask(boatTask2);
        addBoatTask(boatTask3);
        deleteBoatTask(boatTask2);
        printBoatTask();
        map.put("01",boatTask1);
        map.put("02",boatTask2);
        map.put("02",boatTask3);
        searchMap("02");
    }


}