package builder_rezervareRestaurant;

public class RezervareBuilder implements IBuilder{
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    public RezervareBuilder() {
        this.asezareGeam = false;
        this.scauneErgonomice = false;
        this.decorareMasa = false;
        this.muzicaAmbientalaPersonalizata = false;
        this.genMuzica = null;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(asezareGeam, scauneErgonomice, decorareMasa, muzicaAmbientalaPersonalizata, genMuzica);
    }

    public RezervareBuilder setAsezareGeam(boolean asezareGeam){
        this.asezareGeam = asezareGeam;
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice){
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }
    public RezervareBuilder setDecorMasa(boolean decorareMasa){
        this.decorareMasa = decorareMasa;
        return this;
    }
    public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) throws Exception {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) throws Exception {
        if(this.muzicaAmbientalaPersonalizata==true){
            if(genMuzica==null){
                throw new Exception("Trebuie setat genul de muzica");
            }
            this.genMuzica = genMuzica;
        }
        return this;
    }




}
