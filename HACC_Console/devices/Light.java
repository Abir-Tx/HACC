package HACC_Console.devices;

import HACC_Console.utils.*;
public class Light extends Functioner {
    public Light() {
        HACC_Console.utils.Functioner.clearScreen();

        coloredTitleCreator(DEVICES[0]);
        devicesFunctionCreator(DEVICES[0]);
        devicesBack();
    }
}
