package chain_of_responsibility.B16;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Ion", "0711222333", "ion@email.com");
        Client c2 = new Client("Maria", null, "maria@email.com");
        Client c3 = new Client("Vasile", null, null);

        AHandler sms = new NotifSMS();
        AHandler email = new NotifEmail();
        AHandler manager = new NotfiManager();

        sms.setNextHandler(email);
        email.setNextHandler(manager);

        sms.notifica(c1, "Rezervarea dvs. este confirmata.");
        sms.notifica(c2, "Va asteptam la masa rezervata.");
        sms.notifica(c3, "Nu exista date de contact.");
    }
}
