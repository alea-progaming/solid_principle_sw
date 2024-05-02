package SOLID_3;

public class BasicPhone implements PhoneCall, PhoneMessage {

    @Override
    public void makeCall(String number) {
        System.out.println("Basic phone is calling " + number + "... ");
        
    }

    @Override
    public void sendMessage(String number, String sms) {
        System.out.println("Basic phone sends a message: " + sms + " sends to " + number);
        
    }
    
}
