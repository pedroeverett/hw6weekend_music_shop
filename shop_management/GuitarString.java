package shop_management;
import behaviours.*;

public class GuitarString extends Item implements Sellable {

  public GuitarString(String name, String description, int stock, double buyingPrice, double sellingPrice) {
    super(name, description, stock, buyingPrice, sellingPrice);
  }

  public double calculateMarkup() {
    double margin = sellingPrice - buyingPrice;
    double markup = (margin * 100) / buyingPrice;
    return markup;
  }

  public double calculateSingleItemProfit() {
    double profit = sellingPrice - buyingPrice;
    return profit;
  }

  public double calculateItemsInStockProfit() {
    double totalProfit = calculateSingleItemProfit() * stock;
    return totalProfit;
  }

}