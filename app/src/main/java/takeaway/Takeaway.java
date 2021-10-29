package takeaway;

import java.util.ArrayList;
import java.util.List;

public class Takeaway {
ArrayList<String> basket = new ArrayList<>();
  Menu menu;

  public Takeaway(Menu menu){
    this.menu = menu;
  }
  public Boolean add(String dish){
    if(menu.getMenu().containsKey(dish)){
      basket.add(dish);
      return true;
      }else{
      return false;
    } 
  }
    public String total(){
    Double cost = 0.0;
    for (String item : basket) {
      if(menu.getMenu().containsKey(item)){
          cost += menu.getMenu().get(item); 
      }
  }
  return String.format("The total is £%.2f", cost); 
  }

  public List<String> getAll() {
    return basket;
}

  public Boolean checkTotal(CharSequence myTotal){
    if(total().contains(myTotal)){
      return true;
      }else{
      return false;
    } 
  }
      public static void main(String[] args) {
        Menu menu = new Menu();
        Takeaway takeaway = new Takeaway(menu);
        System.out.println(takeaway.add("Chimken"));
        System.out.println(takeaway.add("Choc Cake"));
        System.out.println(takeaway.basket);
        System.out.println(takeaway.total());
        System.out.println(takeaway.checkTotal("5.00"));
      }
}
