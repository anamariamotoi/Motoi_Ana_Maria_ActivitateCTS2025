package composite_restaurant.B8;

public class Item extends AMeniu{
    private String denumire;

    public Item(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afisareMeniu() {
        System.out.println("Denumire Item: " + this.denumire);
    }

    @Override
    public void adauga(AMeniu copil) {
        throw new UnsupportedOperationException("Nu se poate adauga in item");
    }

    @Override
    public void sterge(AMeniu copil) {
        throw new UnsupportedOperationException("Nu se poate sterge din item");
    }

    @Override
    public AMeniu extrage(int index) {
        throw new UnsupportedOperationException("Nu se poate extrage din item");
    }
}
