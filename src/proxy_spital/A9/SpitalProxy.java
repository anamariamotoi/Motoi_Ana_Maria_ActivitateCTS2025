package proxy_spital.A9;

public class SpitalProxy implements ISpital{
    private ISpital spital;

    public SpitalProxy(ISpital spital) {
        this.spital = spital;
    }


    @Override
    public void internarePacient(Pacient p) {
        if(p!=null && p.isAreAsigurare()){
            spital.internarePacient(p);
        }else{
            System.out.println(p+ "nu are asigurare medicala");
        }
    }

    @Override
    public void afisarePacienti() {
        spital.afisarePacienti();
    }
}


