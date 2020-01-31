
/*
javac chapter6.java -d ClassFiles
java -cp  ClassFiles/ PracticalObjectOrientedDesign.chapter6
*/

package PracticalObjectOrientedDesign;

public class Bicycle {
    
    int size;
    int tapecolor;
    
    public Bicycle(){}
    
    public Bicycle(int size, int tapecolor){
        this.size = size;
        this.tapecolor = tapecolor;
    }
    
    void spares(){
        String chain = "10-speed";
        int tireSize = 23;
        int tapecolor = this.tapecolor;
    }
    

    String defaultChain(){
        return "10-speed";
    }

}

public class MountainBike extends Bicycle {
    int frontShock,rearShock;

    public MountainBike(int frontShock, int rearShock){
    
        this.frontShock = frontShock;
        this.rearShock = rearShock;
    
    }
    
    double defaultTire(){
        
        return 2.1;
    
    }

}

public class RoadBike {
    
    int tapeColor;
    
    public RoadBike(int tapeColor){
    
        this.tapeColor = tapeColor;
    
    }
    
    int defaultTire(){
    
        return 23;
    
    }
}
