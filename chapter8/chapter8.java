
/*
javac chapter8.java -d ClassFiles
java -cp  ClassFiles/ PracticalObjectOrientedDesign.chapter8
*/

package PracticalObjectOrientedDesign;

class Bicycle {
    
    int size;
    int tapecolor;
    Parts parts;
    
    public Bicycle(){

    }
    
    public Bicycle(int size, int tapecolor,Parts parts){
    
        this.size = size;
        this.tapecolor = tapecolor;
        this.parts = parts;
    
    }

    void spares(){
    
        parts.spares();
    
    }
    
    String defaultChain(){
    
        return "10-speed";
    
    }
}

class Trip {
 
    Bicycle[]  bicycles;
    int [] cutomers;
    int vehicle;
 
    void prepare(PrepareInterface preparers){

        preparers.prepareTrip(this);

    }

}


interface PrepareInterface {

    public void prepareTrip(Trip trip);

}

class Mechanic implements PrepareInterface{

    Bicycle [] prepareBicycles(Bicycle[] bicycles){
    
        return bicycles;
    
    }
    
    public void prepareTrip(Trip trip){
    
        prepareBicycles(trip.bicycles);
    
    }
    
    Bicycle prepareBicycle(){

        return new Bicycle();

    }

}

class Parts{
 
    int chain;
    int tiresize;
 
    public Parts(){
    }
 
    public Parts(int chain,int tiresize){
 
        this.chain = chain;
        this.tiresize = tiresize;
    
    }
 
    void spares(){
    
        int tiresize = this.tiresize;
        int chain = this.chain;
    
    }
    
    String defaultChain(){
    
        return "10-speed";
    
    }
    
    int defaultTireSize(){
    
        return -1;
    }

}


class RoadBikeParts extends Parts{

    int defaultTireSize(){

        return 23;

    }

}


class MountainBikeParts extends Parts {

}



