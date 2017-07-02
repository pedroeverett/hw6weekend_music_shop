package shop_management;
import java.util.ArrayList;
import behaviours.*;

public class Shop {

  private String name;
  private ArrayList<Sellable> stock;

  public Shop(String name) {
    this.name = name;
    this.stock = new ArrayList<Sellable>();
  }

  public int itemCount() {
    return this.stock.size();
  }
}