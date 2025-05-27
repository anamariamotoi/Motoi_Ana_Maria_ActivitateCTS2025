package proxy_restaurant.B9;

public class RestaurantProxy implements IRestaurant{
    private IRestaurant restaurant;

    public RestaurantProxy(IRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezervaMasa(Client client) {
        if(client!=null && client.getNrPersoane() >= 4){
            restaurant.rezervaMasa(client);
        }else{
            System.out.println("Rezervarea nu se poate efectua pentru clientul: " + client.getNume() +  ". Rezervarea este permisa pentru minim 4 persoane");
        }
    }

    @Override
    public void afisareRezervari() {
        restaurant.afisareRezervari();
    }

}
