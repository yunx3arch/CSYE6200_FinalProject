package com.company;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class BoatIO {
    static File boatFile = new File("boatFile");

    //to write all the boats.
    private static void save(Boat boat, File boatFile) throws IOException{
        boatFile.createNewFile();
        try{
                FileWriter writer = new FileWriter("/Users/shawnaxu/Desktop/Jmiaomiao /Boat/boatFile", true);
                writer.write(boat.toString());
                writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //to read all the boats.
    private static void load(Boat boat, File openFile){
            try{
                BufferedReader br = new BufferedReader(new FileReader("/Users/shawnaxu/Desktop/Jmiaomiao /Boat/boatFile"));
                String line=null;
                while((line=br.readLine())!=null){
                    System.out.println(line);
                }
                br.close();
            }catch(IOException e){
                e.printStackTrace();
            }
    }
    public static void main(String[] args)  throws IOException{
        Boat boat;
        Boat boat1 = new Boat(6, 9, 2, 3, 89, 2);
        Boat boat2 = new Boat(2, 6, 4, 6, 178, 4);
        Boat boat3 = new Boat(1, 4, 6, 4, 268, 1);
        Boat boat4 = new Boat(3, 1, 4, 3, 34, 2);
        Boat boat5 = new Boat(3, 2, 2, 3, 45, 2);
        List<Boat>bList=new ArrayList<>();
        bList.add(boat1);
        bList.add(boat2);
        bList.add(boat3);
        bList.add(boat4);
        bList.add(boat5);
        for(int k  = 0; k< bList.size(); k++) {
            save(bList.get(k), boatFile);

        }

        for(int j  = 0; j< bList.size(); j++){
            load(bList.get(j), boatFile);

        }


        /* Unfinished code.
        FileOutputStream fos=new FileOutputStream("/Users/shawnaxu/Desktop/Jmiaomiao /Boat/boatFile");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(bList);
        oos.close();
        FileInputStream fis=new FileInputStream("/Users/shawnaxu/Desktop/Jmiaomiao /Boat/boatFile");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Object obj= ois.readObject();
        System.out.println(obj);*/

    }

}
