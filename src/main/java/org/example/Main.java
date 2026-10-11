package org.example;

import org.example.adapteur.HdmiVgaAdapter;
import org.example.computer.*;

public class Main {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");
        uniteCentrale.setVga(new VedioProjecteur());
        uniteCentrale.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());

        uniteCentrale.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonsoir Design pattern ");

        uniteCentrale.setVga(new SuperVP());
        uniteCentrale.print("Hello");

        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentrale.setVga(hdmiVgaAdapter1);
        uniteCentrale.print("Bonsoir");


    }
}
