package adapter_spital.A5;

public class AdaptorMedicament implements IMedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public AdaptorMedicament(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
