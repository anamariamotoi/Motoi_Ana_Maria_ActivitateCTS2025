package adapter_spital.A5;

public class Program {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital("Nurofen", 50, true);
        IMedicamentFarmacie adaptor1 = new AdaptorMedicament(medicamentSpital);
        adaptor1.cumparaMedicament();

        MedicamentSpital medicament2 = new MedicamentSpital("Paracetamol", 100, false);
        MedicamentSpital medicament3 = new MedicamentSpital("NoSpa", 30, true);
        MedicamentSpital medicament4 = new MedicamentSpital("Aspirina", 75, false);
        MedicamentSpital medicament5 = new MedicamentSpital("Ketonal", 40, true);

        IMedicamentFarmacie adaptor2 = new AdaptorMedicament(medicament2);
        IMedicamentFarmacie adaptor3 = new AdaptorMedicament(medicament3);
        IMedicamentFarmacie adaptor4 = new AdaptorMedicament(medicament4);
        IMedicamentFarmacie adaptor5 = new AdaptorMedicament(medicament5);

        adaptor2.cumparaMedicament();
        adaptor3.cumparaMedicament();
        adaptor4.cumparaMedicament();
        adaptor5.cumparaMedicament();

    }
}
