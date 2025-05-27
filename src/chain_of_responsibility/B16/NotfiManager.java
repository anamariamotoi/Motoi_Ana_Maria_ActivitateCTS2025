package chain_of_responsibility.B16;

public class NotfiManager extends AHandler{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Managerul este anuntat pentru clientul " + client.getNume() + ": " + mesaj);
    }
}
