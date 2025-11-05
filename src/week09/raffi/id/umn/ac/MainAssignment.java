package week09.raffi.id.umn.ac;

public class MainAssignment {
    public static void main(String[] args) {
        
        Smartphone phone = new Smartphone("Samsung", "Galaxy S21");

       
        phone.displayInfo();

        
        phone.turnOn();

        phone.increaseVolume(5);
        phone.decreaseVolume(3);

        phone.connectToWiFi("HomeNetwork");
        phone.disconnectFromWiFi();

        phone.turnOf();
    }
}