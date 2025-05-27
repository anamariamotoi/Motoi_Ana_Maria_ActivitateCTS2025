package flyweight_restaurant.B10;


import java.util.HashMap;

public class ClientFactory {
    private static HashMap<String, Client> clienti = new HashMap<>();
    private static int nrClienti = 0;

    public static Client getClient(String nume, String telefon) {
        nrClienti++;
        Client client = clienti.get(nume);
        if (client==null) {
            client = new Client(nume, telefon);
            clienti.put(nume, client);
        }
        return client;
    }

    public static int getNrClienti(){
        return nrClienti;
    }
}
