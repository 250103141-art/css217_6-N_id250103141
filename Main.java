package bridge;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Task 4 =====");
        Device light = new SmartLight();
        AdvancedRemote remote = new AdvancedRemote(light);
        remote.powerOn();
        remote.mute();


        System.out.println("\n===== Task 5 =====");
        Device radio = new Radio();
        PartyRemote partyRemote = new PartyRemote(radio);
        partyRemote.partyMode();

        System.out.println("\n===== Task 6 =====");
        Hero knight1 = new Knight(new Sword());
        knight1.attack();

        Hero knight2 = new Knight(new MagicWand());
        knight2.attack();
    }
}
