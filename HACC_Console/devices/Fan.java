package HACC_Console.devices;

import HACC_Console.utils.*;

public class Fan extends Functioner {
    public Fan() {
        HACC_Console.utils.Functioner.clearScreen();

        coloredTitleCreator(DEVICES[1]);
        devicesFunctionCreator(DEVICES[1]);
        devicesBack();
    }
}
