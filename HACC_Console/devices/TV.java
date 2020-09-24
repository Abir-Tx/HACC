package HACC_Console.devices;

import HACC_Console.utils.Functioner;

public class TV extends Functioner {
    public TV(){
        HACC_Console.utils.Functioner.clearScreen();

        coloredTitleCreator(DEVICES[2]);
        devicesFunctionCreator(DEVICES[2]);
        devicesBack();

    }
    
}
