package template_spital.A14;

public abstract class AProcesInternare {
    public abstract void verificareStarePacient();
    public abstract void verificareDisponibilitatePat();
    public abstract void emitereFisaInternare();

    public final void interarePacient(){
        verificareStarePacient();
        verificareDisponibilitatePat();
        emitereFisaInternare();
    }
}
