package mavenIntro.springExample;

import mavenIntro.springExample.Car;
import mavenIntro.springExample.Bike;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Car c = new Car();
        Bike b = new Bike();
        
        c.drive();
        b.ride();
    }
}
