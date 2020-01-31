
/*
javac chapter5.java -d ClassFiles
java -cp  ClassFiles/ PracticalObjectOrientedDesign.chapter5
*/
package PracticalObjectOrientedDesign;

public interface PrepareInterface{

    public void prepareTrip(Trip trip);

}

class Driver implements PrepareInterface{

    public void prepareTrip(Trip trip){

        gasUp(trip.vehicle);
        fillWaterTank(trip.vehicle);
    
    }

    void gasUp(int vehicle){
    }

    void fillWaterTank(int vehicle){
    }

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

class Trip{
    Bicycle[]  bicycles;
    int [] cutomers;
    int vehicle;

    void prepare(PrepareInterface preparers){
        preparers.prepareTrip(this);
    }

}

class TripCoordinator implements PrepareInterface{

    void buyFood(int[] customers){

    }

    public void prepareTrip(Trip trip){

        buyFood(trip.cutomers);

    }

}


class Bicycle{

}

