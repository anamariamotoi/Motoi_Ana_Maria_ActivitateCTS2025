package composite_restaurant.B8;

public abstract class AMeniu {
    public abstract void afisareMeniu();

    public abstract void adauga(AMeniu copil);
    public abstract void sterge(AMeniu copil);
    public abstract AMeniu extrage(int index);
}
