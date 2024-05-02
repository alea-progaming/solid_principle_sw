package SOLID_3;

public class Samsung implements PhoneCall, PhoneMessage, Browser, Camera{

    @Override
    public void makeCall(String number) {
        System.out.println("Samsung phone is calling " + number + "... ");
        
    }

    @Override
    public void sendMessage(String number, String sms) {
        System.out.println("Samsung sends a message: " + sms + " sends to " + number);
        
    }

    @Override
    public void browse(String url) {
        System.out.println("Samsung browses " + url);
        
    }

    @Override
    public void takePicture() {
        System.out.println("Samsung camera captured...");
        
    }
    
}
