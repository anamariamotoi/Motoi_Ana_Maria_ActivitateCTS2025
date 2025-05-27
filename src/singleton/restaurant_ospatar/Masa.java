package singleton.restaurant_ospatar;

public class Masa {
    private int id;
    private boolean ocupata;

    public Masa(int id){
        this.id = id;
        this.ocupata = false;
    }

    public int getId() {
        return id;
    }

    public boolean isOcupata() {
        return ocupata;
    }


    public void setOcupata(boolean ocupata) {
        this.ocupata = ocupata;
    }


    @Override
    public String toString() {
        return "Masa{" +
                "id=" + id +
                ", ocupata=" + ocupata +
                '}';
    }
}
