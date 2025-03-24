package singleton.restaurant_ospatar;

import java.util.List;

public class Ospatar {
    private Restaurant restaurant;
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
        this.restaurant = Restaurant.getInstance();
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Ospatar{" + ", nume='" + nume + '\'' + '}';
    }
}
