
/*
javac ReverseDependency.java -d ClassFiles
java -cp  ClassFiles/ PracticalObjectOrientedDesign.ReverseDependency
*/
package PracticalObjectOrientedDesign;



class Wheel{
    int rim;
    double tire;
    Gear gear;

    Wheel(int rim, double tire, int chainring, int cog){
        this.rim = rim;
        this.tire = tire;
        this.gear = new Gear(chainring, int cog)
    }

    double diameter(){
        return rim + (tire * 2);
    }

    public double gear_inches(int diameter){
        return gear.gear_inches(diameter());
    }
}

class Gear{
    int chainring, cog;

    Gear(int chainring, int cog){
        this.chainring = chainring;
        this.cog = cog;
    }

    public double ratio(){
        return chainring / (double) cog;
    }

    public double gear_inches(int diameter){
        return ratio() * diameter();
    }
}

public class ReverseDependency{

   public static void main(String[] args){
        System.out.println((new Wheel(26, 1.5, 52, 11, wheel)).gear_inches());
    }
}
