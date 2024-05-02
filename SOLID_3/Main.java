package SOLID_3;

public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();


        System.out.println();

        System.out.println("---Basic Phone---");
        basicPhone.makeCall("0956-767-4764");
        basicPhone.sendMessage("0932-871-9914", "Great Morning!");
        
        System.out.println();

        System.out.println("---Samsung---");
        samsung.makeCall("0956-446-5417");
        samsung.sendMessage("0922-465-8897", "Are you going to attend the piano class?");
        samsung.browse("twitter.com");
        samsung.takePicture();

        System.out.println();

        System.out.println("---Iphone---");
        iphone.makeCall("0941-287-9480");
        iphone.sendMessage("0992-984-3654", "What are you up to?");
        iphone.browse("instagram.com");
        iphone.takePicture();
    }
}
