/*- Create a SmartDevice class that can both Camera and Phone features. Implement two interfaces Camera (with clickPhoto()) and Phone (with makeCall()) 
and demonstrate a class Smartphone that combines both behaviors.*/

// Camera interface
interface Camera {
    void clickPhoto();
}

// Phone interface
interface Phone {
    void makeCall();
}

// Class implementing both interfaces
class SmartDevice implements Camera, Phone {

    @Override
    public void clickPhoto() {
        System.out.println("Photo clicked using SmartDevice camera!");
    }

    @Override
    public void makeCall() {
        System.out.println("Calling using SmartDevice...");
    }
}

// Smartphone class extending SmartDevice
class Smartphone extends SmartDevice {

    void browseInternet() {
        System.out.println("Browsing internet on Smartphone...");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();

        sp.clickPhoto();      // Camera feature
        sp.makeCall();        // Phone feature
        sp.browseInternet();  // Extra feature
    }
}
