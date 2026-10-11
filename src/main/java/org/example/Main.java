package org.example;

import org.example.computer.Ecran;
import org.example.computer.UniteCentrale;
import org.example.computer.VedioProjecteur;

public class Main {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");
        uniteCentrale.setVga(new VedioProjecteur());
        uniteCentrale.print("Bonjour");

    }
}
