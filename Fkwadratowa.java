package fkwadratowa;
/**
 * @author Michał
 */
public class Fkwadratowa {

    double a,b,c;
    
    Fkwadratowa(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * @param a
     * @param b
     * @param c
     * @return delta from a, b, c
     */
   double Delta (double a, double b, double c)
   {
       return b * b - (4 * a * c);
   }
   /**
     * has private variables a, b, c
     * using Delta(double a, double b, double c)
     * @return mzerowe
     */
    double MiejscaZerowe()
    {
        double mzerowe;
        double delta = Delta(a, b, c);
        
        if (delta < 0)
        {
            mzerowe = Double.POSITIVE_INFINITY;
        }
        else if (delta == 0)
        {
            mzerowe = -b / 2 *a;
        }
        else 
        {
            mzerowe = (((-b - Math.sqrt(delta))/(2*a))+(-b + Math.sqrt(delta))/(2*a));
        }
        return mzerowe;
    }
}   
