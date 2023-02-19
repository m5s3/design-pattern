package org.example;

import org.example.adapter.*;
import org.example.singleton.A;

public class Main {
    public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110v adapterAirConditioner = new SocketAdapter(airConditioner);
        connect(adapterAirConditioner);

        Cleaner cleaner = new Cleaner();
        Electronic110v adapter = new SocketAdapter(cleaner);
        connect(adapter);
    }


    public static void connect(Electronic110v electronic110v) {
        electronic110v.powerOn();
    }
}