package proxy_spital.A9;

public class Program {
    public static void main(String[] args) {
        ISpital spital = new Spital("Spitalul de urgente");
        Pacient pacient1 = new Pacient("Ana", true);
        Pacient pacient2 = new Pacient("Maria", true);
        Pacient pacient3 = new Pacient("Ion", false);
        Pacient pacient4 = new Pacient("Gigel", true);
        Pacient pacient5 = new Pacient("Andreea", false);

        spital.internarePacient(pacient1);

        ISpital spitalProxy = new SpitalProxy(spital);
        spitalProxy.internarePacient(pacient3);
        spitalProxy.internarePacient(pacient2);
        spitalProxy.internarePacient(pacient4);
        spitalProxy.internarePacient(pacient5);

        spitalProxy.afisarePacienti();

    }
}
