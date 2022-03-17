
package cz.tul.agp1.thurs.zlomky;


public class Fractions {
    private int numerator;
    private int denominator;
    

    public Fractions(String input){
        String delims = "[ /]";
        String[] tokens = input.split(delims);
        this.numerator = Integer.parseInt(tokens[0]);
        this.denominator = Integer.parseInt(tokens[1]);
    }
    public Fractions(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    @Override //prekryti metody
    public String toString(){
       if (denominator == 1){
           return ""+numerator;
       }else{
            return String.format("%d/%d", numerator, denominator);
       }
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    public double returnDouble(){
        return (double)numerator/denominator;
    }
    
    
}
