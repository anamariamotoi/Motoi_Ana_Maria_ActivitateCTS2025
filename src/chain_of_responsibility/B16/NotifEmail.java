package chain_of_responsibility.B16;

public class NotifEmail extends AHandler{
    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getEmail() != null && !client.getEmail().isEmpty()) {
            System.out.println("Email catre " + client.getNume() + ": " + mesaj);
        } else if (nextHandler != null) {
            nextHandler.notifica(client, mesaj);
        }
    }
}
