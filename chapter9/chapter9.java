
/*
javac chapter9.java -d ClassFiles
java -cp  ClassFiles/ PracticalObjectOrientedDesign.chapter9
*/

package PracticalObjectOrientedDesign;

import static org.junit.Assert.*;
import org.junit.Test;

class Test1 {

    public void test(){

        Gear gear = new Gear(52,11,26,2);
        assertEquals(137.1,gear.gearInches());

    }
}

class Test2 {

    public void test(){

        Wheel wheel = new Wheel(26, 2);
        assertEquals(30,wheel.diameter());

    }
}
