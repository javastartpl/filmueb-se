package app;

import controller.ApplicationController;

public class Filmueb {

    public static void main(String[] args) {
        final String appName = "Filmueb v0.7";
        System.out.println(appName);

        ApplicationController controller = new ApplicationController();
        controller.mainLoop();
    }


}
