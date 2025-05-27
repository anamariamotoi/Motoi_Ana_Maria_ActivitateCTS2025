package proxy_restaurant.B9;

public class Program {
    public static void main(String[] args) {

        IRestaurant restaurant = new Restaurant("Mancaruri romanesti");
        Client client1 = new Client("Ana", 5, "12.06.2025", "12:00");
        Client client2 = new Client("Maria", 3, "13.06.2025", "18:30");
        Client client3 = new Client("Raluca", 2, "14.06.2025", "20:00");
        Client client4 = new Client("Ion", 4, "15.06.2025", "12:45");
        Client client5 = new Client("Vali", 6, "16.06.2025", "19:15");
        Client client6 = new Client("Florina", 1, "17.06.2025", "13:30");

        IRestaurant restaurantProxy = new RestaurantProxy(restaurant);
        restaurantProxy.rezervaMasa(client1);
        restaurantProxy.rezervaMasa(client2);
        restaurantProxy.rezervaMasa(client3);
        restaurantProxy.rezervaMasa(client4);
        restaurantProxy.rezervaMasa(client5);
        restaurantProxy.rezervaMasa(client6);

        restaurantProxy.afisareRezervari();




    }
}
