package com.company;

    import javax.swing.*;

public class Main {


    public static void main(String[] args) {






        partialString( (JOptionPane.showInputDialog("wort eingeben")));


    }

    public static void partialString(String a)
    {
        if (a.length() <3)
        {
            System.out.println("error");


        }
        else
            {
            System.out.println(a.substring(a.length()/2));
            //a.substring ermöglicht Teile eines Strings auszulesen
                // /2 gibt die 2te hälfte des strings aus
        }

}
    }


