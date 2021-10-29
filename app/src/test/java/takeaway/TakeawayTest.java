package takeaway;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class TakeawayTest {
  @Test
  public void testStartsWithEmptyBasket() {
    Menu mockedMenu = mock(Menu.class);
    Takeaway myRestaurant = new Takeaway(mockedMenu);
    ArrayList<String> myBasket = myRestaurant.basket;
    assertTrue(myBasket.isEmpty());
  }
  
  @Test
public void testAddsDishes() {
  Menu menu = new Menu();
  Takeaway myRestaurant = new Takeaway(menu);
    myRestaurant.add("Chimken");
    String dish = myRestaurant.getAll().get(0);
    assertEquals("Chimken", dish);
}
@Test
public void testAddDishNotInMenu(){
  Menu menu = new Menu();
  Takeaway myRestaurant = new Takeaway(menu);
  myRestaurant.add("Hotdogs");
  assertEquals(myRestaurant.add("Hotdogs"), false );
  assertTrue(myRestaurant.basket.isEmpty());
}
@Test 
public void testGivesTotal(){
  Menu menu = new Menu();
  Takeaway myRestaurant = new Takeaway(menu);
  myRestaurant.add("Chimken");
  assertThat(myRestaurant.total(), equalTo("The total is £3.50"));
  }
  @Test
  public void testChecksYourTotalMatchesGivenTotal(){
    Menu menu = new Menu();
    Takeaway myRestaurant = new Takeaway(menu);
    myRestaurant.add("Chimken");
    assertTrue(myRestaurant.checkTotal("3.50"));
  }
}

