import javax.swing.*;

public class Taschenrechner {

    public static double addieren(double a, double b) //statische methoden können ausgeführt werden ohne dass sie Teil eines objekts sin, nicht statische methoden müssen tel eines objekts sein
    {        a= Double.parseDouble(JOptionPane.showInputDialog(null,"zahl eingeben"));
             b= Double.parseDouble(JOptionPane.showInputDialog(null,"zahl2 add"));
        return a + b;


    }

    public static double subtrahieren(double c, double d)

    {
        c=Double.parseDouble(JOptionPane.showInputDialog(null,"zahl eingeben sub"));
        d=   Double.parseDouble(JOptionPane.showInputDialog(null,"zahl2 sub"));
        return c-d;
    }

    public static double multiplizieren (double e, double f)
    {
        e=Double.parseDouble(JOptionPane.showInputDialog(null,"zahl eingeben multi"));
        f=        Double.parseDouble(JOptionPane.showInputDialog(null,"zah2 eingeben multi"));
        return e*f;
    }

    public static double dividieren (double g, double h)
    {
        g=Double.parseDouble(JOptionPane.showInputDialog(null,"zahl eingeben divi"));
        h=        Double.parseDouble(JOptionPane.showInputDialog(null,"zah2 eingeben divi"));
        return g/h;
    }
}

