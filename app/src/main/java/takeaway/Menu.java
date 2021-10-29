package takeaway;
import java.util.HashMap;

public class Menu {
  public HashMap<String, Double> restaurantMenu = new HashMap<String, Double>();

  public Menu() {
      restaurantMenu.put("Chimken",3.50);
      restaurantMenu.put("Choc Cake",1.50);
      restaurantMenu.put("Garlic Bread",1.50);
  }

  public void seeMenu() {
    for (String i : restaurantMenu.keySet()) {
        System.out.printf("%s : %.2f \n", i, restaurantMenu.get(i));
    }
  }
  public static void main(String[] args){
    Menu menu = new Menu();
    menu.seeMenu();
  }
}