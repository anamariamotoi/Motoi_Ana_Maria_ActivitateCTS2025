package facade_spital.A6;

public class Pacient {
    private String nume;
    private int gradUrgenta;

    public Pacient(String nume, int gradUrgenta) {
        this.nume = nume;
        this.gradUrgenta = gradUrgenta; //1-5
    }

    public boolean stareGrava(){
        return this.gradUrgenta>=4;
    }
}
