package org.example.computer;

public class TV implements Hdmi{
    @Override
    public void view(byte[] data) {
        System.out.println("--------------------------");
        String message=new String(data);
        System.out.println(message);
        System.out.println("--------------------------");

    }
}
