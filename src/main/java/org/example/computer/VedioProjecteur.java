package org.example.computer;

public class VedioProjecteur implements Vga{
    @Override
    public void print(String message) {
        System.out.println("============ VedioProjecteur ===============");
        System.out.println(message);
        System.out.println("============ VedioProjecteur ===============");
    }
}
