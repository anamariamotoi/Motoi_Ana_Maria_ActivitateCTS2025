package builder_pacient;

public class PacientBuilder implements IBuilder{
    private Pacient pacient;

    public PacientBuilder(){
        pacient = new Pacient(false, false,false, false);
    }

    @Override
    public Pacient build() {
        return pacient;
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil){
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDejun(boolean micDejun){
        this.pacient.setMicDejun(micDejun);
        return this;
    }

    public PacientBuilder setPapuciCamera(boolean papuciCamera){
        this.pacient.setPapuciCamera(papuciCamera);
        return this;
    }

    public PacientBuilder setHalatInterior(boolean halatInterior){
        this.pacient.setHalatInterior(halatInterior);
        return this;
    }
}
