package HACC_Console.devices;

import HACC_Console.utils.Functioner;

public class Motor extends Functioner {
    public Motor(){
        HACC_Console.utils.Functioner.clearScreen();

        coloredTitleCreator(DEVICES[3]);
        devicesFunctionCreator(DEVICES[3]);
        devicesBack();
    }
}
