package HACC_Console.devices;

import HACC_Console.utils.Functioner;

public class Speaker extends Functioner {
    public Speaker(){
        HACC_Console.utils.Functioner.clearScreen();

        coloredTitleCreator(DEVICES[5]);
        devicesFunctionCreator(DEVICES[5]);
        devicesBack();

    }
}
