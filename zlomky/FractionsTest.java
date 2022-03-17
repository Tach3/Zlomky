
package cz.tul.agp1.thurs.zlomky;


public class FractionsTest {


    public static void main(String[] args) {

        Fractions yourFraction = new Fractions(1,2);
        Fractions myFraction = new Fractions("12 12");
        System.out.println(yourFraction);
        System.out.println(myFraction);
        System.out.println("Citatel je: " + yourFraction.getNumerator());
        System.out.println("Menovatel je: " + yourFraction.getDenominator());
        System.out.println("Double je: " + yourFraction.returnDouble());
        
        
        
    }
    
}
