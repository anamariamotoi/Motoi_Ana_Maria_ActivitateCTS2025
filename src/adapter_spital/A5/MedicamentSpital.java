package adapter_spital.A5;

public class MedicamentSpital {
    private String nume;
    private float pret;
    private boolean eliberareReteta;

    public MedicamentSpital(String nume, float pret, boolean eliberareReteta) {
        this.nume = nume;
        this.pret = pret;
        this.eliberareReteta = eliberareReteta;
    }

    public void prezintaReteta(){
        if(this.eliberareReteta) {
            System.out.println("Se verifica reteta pentru medicamentul: " + this.nume);
        }
    }
    public void achizitioneazaMedicament(){
        if(this.eliberareReteta){
            prezintaReteta();
            System.out.println("Medicamentul " + this.nume + "a fost achizitionat pe baza retetei");
        }else{
            System.out.println("Medicamentul " + this.nume + "a fost achizitionat fara reteta");
        }
    }
}
