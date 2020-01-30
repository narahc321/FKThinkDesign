/*
javac chapter2.java -d ClassFiles
java -cp  ClassFiles/ PracticalObjectOrientedDesign.chapter2
*/
package PracticalObjectOrientedDesign;

// ____________________________________________________________________________________________________________________________________________

// CODE 1
// Page 18

// public class chapter2{

// 	public static void code1(){
// 		int chainring, cog;
// 		double ratio;
// 		chainring = 52;
// 		cog = 11;
// 		ratio = chainring / (double)cog; 
// 		System.out.println(ratio);

// 		chainring = 30;
// 		cog = 27;
// 		ratio = (chainring / (double)cog; 
// 		System.out.println(ratio);


// 		
// 	}

// 	public static void main(String[] args){
// 		code1();
 
// 	}
// }

// output:
// 4.7272725105285645
// 1.1111111640930176

// ____________________________________________________________________________________________________________________________________________


// Code 2
// Page 20

// class Gear{
// 	int chainring, cog, rim;
// 	double tire;	
// 	Gear(int chainring, int cog, int rim, double tire){
// 		this.chainring = chainring;
// 		this.cog = cog;
// 		this.rim = rim;
// 		this.tire = tire;
// 	}

// 	public double ratio(){
// 		return chainring / (double) cog;
// 	}

// 	public double gear_inches(){
// 		return ratio() * (rim + (tire * 2));
// 	}
// }

// public class chapter2{

//    public static void main(String[] args){
// 		System.out.println((new Gear(52, 11, 26, 1.5)).gear_inches());
// 		System.out.println((new Gear(52, 11, 24, 1.25)).gear_inches());
// 	}
// }


// output:
// 137.0909090909091
// 125.27272727272728

// // ____________________________________________________________________________________________________________________________________________



// Code 2 3
// Page 19, 20

// class Gear{
// 	int chainring, cog, rim;
// 	double tire;	
// 	Gear(int chainring, int cog, int rim, double tire){
// 		this.chainring = chainring;
// 		this.cog = cog;
// 		this.rim = rim;
// 		this.tire = tire;
// 	}

// 	public double ratio(){
// 		return chainring / (double) cog;
// 	}

// 	public double gear_inches(){
// 		return ratio() * (rim + (tire * 2));
// 	}
// }

// public class chapter2{

//    public static void main(String[] args){
// 		System.out.println((new Gear(52, 11, 26, 1.5)).gear_inches());
// 		System.out.println((new Gear(52, 11, 24, 1.25)).gear_inches());
// 	}
// }


// ____________________________________________________________________________________________________________________________________________



class Wheel{
	int rim;
	double tire;
	Wheel(int rim, double tire){
		this.rim = rim;
		this.tire = tire;
	}

	double diameter(){
		return rim + (tire * 2);
	}

	double circumference(){
		return diameter() * Math.PI;
	}
}


class Gear{
	int chainring, cog;
	Wheel wheel;
	Gear(int chainring, int cog, Wheel wheel){
		this.chainring = chainring;
		this.cog = cog;
		this.wheel = wheel;
	}

	Gear(int chainring, int cog){
		this.chainring = chainring;
		this.cog = cog;
	}

	public double ratio(){
		return chainring / (double) cog;
	}

	public double gear_inches(){
		return ratio() * wheel.diameter();
	}
}

public class chapter2{

   public static void main(String[] args){
   		Wheel wheel = new Wheel(26, 1.5);
   		System.out.println(wheel.diameter());
		System.out.println((new Gear(52, 11, wheel)).gear_inches());
		System.out.println((new Gear(52, 11)).ratio());
	}
}





