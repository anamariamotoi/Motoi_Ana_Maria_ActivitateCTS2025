package chain_of_responsibility.B16;

public class NotifSMS extends AHandler{

    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getNrTelefon() != null && !client.getNrTelefon().isEmpty()) {
            System.out.println("SMS catre " + client.getNume() + ": " + mesaj);
        } else if (nextHandler != null) {
            nextHandler.notifica(client, mesaj);
        }
    }
}
