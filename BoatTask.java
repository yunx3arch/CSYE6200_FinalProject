package com.company;

public class BoatTask {
    //information about boats.
    int ID;
    String TaskName;
    String Objective;
    String StartDate;
    String BoatID;
    //add an constructor.
    BoatTask(int id, String tn, String ob, String sd, String bid){
        ID = id;
        TaskName = tn;
        Objective = ob;
        StartDate = sd;
        BoatID = bid;
    }
    //Make the list to string.
    public String toString() {
        return "BoatTask{" +
                "ID=" + ID +
                ", TaskName='" + TaskName + '\'' +
                ", taskTarget='" + Objective + '\'' +
                ", startDate=" + StartDate +
                ", BoatID=" + BoatID +
                '}';
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        this.TaskName = TaskName;
    }
    public String getObjective() {
        return Objective;
    }

    public void setObjective(String Objective) {
        this.Objective = Objective;

    }
    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }
    public String getBoatID() {
        return BoatID;
    }

    public void setBoatID(String StartDate) {
        this.BoatID = BoatID;
    }

}
