package SOLID_3;

public class Iphone implements PhoneCall, PhoneMessage, Camera, Browser {
    @Override
    public void makeCall(String number) {
        System.out.println("Iphone phone is calling " + number + "... ");
        
    }

    @Override
    public void sendMessage(String number, String sms) {
        System.out.println("Iphone sends a message: " + sms + " sends to " + number);
        
    }

    @Override
    public void browse(String url) {
        System.out.println("Iphone browses " + url);
        
    }

    @Override
    public void takePicture() {
        System.out.println("Iphone camera captured...");
        
    }
}
