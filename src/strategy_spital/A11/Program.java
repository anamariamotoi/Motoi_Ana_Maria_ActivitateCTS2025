package strategy_spital.A11;

public class Program {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ana");
        pacient.setModPlata(new PlataCard());
        pacient.plateste(100);

        pacient.setModPlata(new PlataCash());
        pacient.plateste(200);
    }
}
