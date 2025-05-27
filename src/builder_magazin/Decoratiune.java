package builder_magazin;

public class Decoratiune implements IDecoratiune {
    private ETipMaterial tipMaterial;
    private String denumire;

    public Decoratiune(ETipMaterial tipMaterial, String denumire) {
        this.tipMaterial = tipMaterial;
        this.denumire = denumire;
    }


    @Override
    public String toString() {
        return "Decoratiune [" +
                "tipMaterial=" + tipMaterial +
                ", denumire='" + denumire +
                ']';
    }

    @Override
    public ETipMaterial getMaterial() {
        return this.tipMaterial;
    }
}

