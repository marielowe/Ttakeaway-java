package takeaway;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import org.junit.Test;

public class MenuTest {
  @Test
  public void testHasListOfDishesAndPrices(){
    Menu myMenuClass = new Menu();
    HashMap<String, Double> restaurantMenu = new HashMap<>();
    restaurantMenu.put("Chimken",3.50);
    restaurantMenu.put("Choc Cake",1.50);
    restaurantMenu.put("Garlic Bread",1.50);
    myMenuClass.seeMenu();
    assertFalse(restaurantMenu.isEmpty());
    assertThat(restaurantMenu,hasKey("Chimken"));
  }
  @Test
  public void testShowsListOfDishesAndPrices(){
    HashMap<String, Double> restaurantMenu = new HashMap<>();
    restaurantMenu.put("Chimken",3.50);
    restaurantMenu.put("Choc Cake",1.50);
    restaurantMenu.put("Garlic Bread",1.50);
    assertThat(restaurantMenu, aMapWithSize(3));

}
}
