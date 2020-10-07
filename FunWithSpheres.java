
/**
 * Makes a Sphere of random size out of a random metal.
 * Displays Sphere's instance information.
 * The Sphere object is passed by reference to a MidasTouch object
 *    and changed into a Sphere of gold with the same mass.
 * Displays the transformed Sphere's instance information.
 * 
 * DO NOT MODIFY THIS CLASS
 *       
 * GrayKnight CPM
 * 5/29/18
 */
import java.util.Scanner;

public class FunWithSpheres
{
    

    public void turningSpheresIntoGold()
    {
        //Makes a Sphere of random size out of a random metal
        Sphere ball = new Sphere();
        
        //Display Sphere's instance information
        System.out.println(ball);
        
        //Dramatic effect
        System.out.println("\t\"POOF\"");
        
        //instantiate a MidasTouch object
        MidasTouch mt = new MidasTouch();
        
        //The Sphere object is passed by reference to a MidasTouch object
        // and changed into a Sphere of gold with the same mass.
        mt.transformSphere(ball);
        
        //Display the transformed Sphere's instance information
        System.out.println(ball + "\n");        
    }


}
