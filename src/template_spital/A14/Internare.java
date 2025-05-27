package template_spital.A14;

public class Internare extends AProcesInternare{

    @Override
    public void verificareStarePacient() {
        System.out.println("Se verifica starea pacientului. Starea pacientului este grava.");
    }

    @Override
    public void verificareDisponibilitatePat() {
        System.out.println("Se verifica disponibilitatea patului.");
    }

    @Override
    public void emitereFisaInternare() {
        System.out.println("Se emite fisa de internare.");
    }
}
