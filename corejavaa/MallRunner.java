public class MallRunner{
public static void main(String[] args) {
        Mall myMall = new Mall();
        String[] shops = {"Shop1", "Shop2", "Shop3"};
        myMall.displayShops(shops);
        myMall.displayFloors(5);
        myMall.displayParking(true);
        myMall.displayMallName("Sunshine Mall");
    }
}