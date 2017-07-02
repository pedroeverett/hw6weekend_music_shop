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

  public void addStock(Sellable item) {
    this.stock.add(item);
  }

  public Integer removeStock() {
    if (itemCount() > 0) {
      stock.remove(0);
      // int level = this.stock.size();
      // return level;
      return itemCount();
    }
    return null;
  }

  public double totalMarkup() {
    double total = 0;
    for ( Sellable item : this.stock ) {
      total += item.calculateMarkup();
    }
    return total;
  }

  public double totalProfit() {
    double total = 0;
    for (Sellable item : this.stock)  {
      total += item.calculateItemsInStockProfit();
    }
    return total;
  }
}