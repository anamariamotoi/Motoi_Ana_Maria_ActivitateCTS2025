package composite_spital.A8;

public class Program {
    public static void main(String[] args) {

        ANod sectie1 = new Sectie("Cardiologie");
        ANod sectie2 = new Sectie("Ortopedie");
        ANod sectie3 = new Sectie("Pediatrie");
        ANod sectie4 = new Sectie("Ginecologie");
        ANod sectie5 = new Sectie("Terapie Intensiva");

        ANod subDep1 = new Subdepartament("Chirurgie Generala");
        ANod subDep2 = new Subdepartament("Oncologie Medicala");
        ANod subDep3 = new Subdepartament("Endocrinologie");
        ANod subDep4 = new Subdepartament("Neonatologie");

        ANod departament1 = new Departament("Medical");
        ANod departament2 = new Departament("Chirurgical");
        ANod departament3 = new Departament("Urgenta");

        departament1.adauga(sectie1);
        departament1.adauga(sectie3);
        departament1.adauga(subDep3);

        departament2.adauga(sectie2);
        departament2.adauga(subDep1);
        departament2.adauga(subDep2);

        departament3.adauga(sectie4);
        departament3.adauga(sectie5);
        departament3.adauga(subDep4);

        departament1.afiseazaDetalii();
        departament2.afiseazaDetalii();
        departament3.afiseazaDetalii();
    }
}
