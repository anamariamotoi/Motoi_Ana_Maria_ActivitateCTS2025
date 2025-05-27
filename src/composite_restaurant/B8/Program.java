package composite_restaurant.B8;

public class Program {
    public static void main(String[] args) {

        AMeniu item1 = new Item("Bruschete");
        AMeniu item2 = new Item("Supa crema de legume");
        AMeniu item3 = new Item("Friptura de porc");
        AMeniu item4 = new Item("Tiramisu");
        AMeniu item5 = new Item("Limonada");

        AMeniu subsectiuneSupe = new Subsectiune("Supe si ciorbe");
        AMeniu subsectiuneAperitiveReci = new Subsectiune("Aperitive reci");
        AMeniu subsectiuneSucuri = new Subsectiune("Sucuri");

        subsectiuneAperitiveReci.adauga(item1);
        subsectiuneSupe.adauga(item2);
        subsectiuneSucuri.adauga(item5);

        AMeniu startere = new Sectiune("Startere");
        AMeniu felPrincipal = new Sectiune("Fel principal");
        AMeniu deserturi = new Sectiune("Deserturi");
        AMeniu bauturi = new Sectiune("Bauturi");

        startere.adauga(subsectiuneAperitiveReci);
        felPrincipal.adauga(item3);
        deserturi.adauga(item4);
        bauturi.adauga(subsectiuneSucuri);

        AMeniu meniu = new Meniu();
        meniu.adauga(startere);
        meniu.adauga(felPrincipal);
        meniu.adauga(deserturi);
        meniu.adauga(bauturi);

        meniu.afisareMeniu();


    }
}
