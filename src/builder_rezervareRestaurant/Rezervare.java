package builder_rezervareRestaurant;


public class Rezervare  {
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    Rezervare(boolean asezareGeam, boolean scauneErgonomice, boolean decorareMasa, boolean muzicaAmbientalaPersonalizata, String genMuzica) {
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public boolean isAsezareGeam() {
        return asezareGeam;
    }

    public boolean isScauneErgonomice() {
        return scauneErgonomice;
    }

    public boolean isDecorareMasa() {
        return decorareMasa;
    }

    public boolean isMuzicaAmbientalaPersonalizata() {
        return muzicaAmbientalaPersonalizata;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare [" +
                "asezareGeam=" + asezareGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareMasa=" + decorareMasa +
                ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
