package pl.edu.ur.oopl6.zad1;

public class Figury {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r) {
        return 2 * Math.PI * r;
    }

    // Metoda obliczająca pole kwadratu
    public static double PoleKwadratu(double a) {
        return a * a;
    }

    //Metoda obliczająca pole kwadratu
    public static double ObwodKwadratu(double a) {
        return 4 * a;
    }
    
    //Metoda obliczająca pole prostokąta
    public static double PoleProstokata(double a, double b){
        return a*b;
    }
    
    //Metoda obliczająca obwód prostokąta
    public static double ObwodProstokata(double a, double b){
        return 2*a+2*b;
    }
    
    //Metoda obliczająca pole stożka
    public static double PoleStozka(double r, double l){
        return Math.PI*r*(r+l);        
    }
    
    //Metoda obliczająca objętość stożka
    public static double ObjetoscStozka(double r, double h){
        return (Math.PI*r*r*h)/3;
    }
    
    //Metoda obliczająća pole walca
    public static double PoleWalca(double r, double h){
        return 2*Math.PI*r*(r+h);
    }
    
    //Metoda obliczająca objętość stożka
    public static double ObjetoscWalca(double r, double h){
        return Math.PI*r*r*h;
    }

}
