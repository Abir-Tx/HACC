package HACC_Console.devices;

import HACC_Console.utils.Functioner;

public class PC extends Functioner {
    public PC(){
        HACC_Console.utils.Functioner.clearScreen();

        coloredTitleCreator(DEVICES[4]);
        devicesFunctionCreator(DEVICES[4]);
        devicesBack();
    }
}
