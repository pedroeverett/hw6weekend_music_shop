package shop_management;
import behaviours.*;

public class SheetMusic extends Item implements Sellable {

  public SheetMusic(String name, String description, int stock, double buyingPrice, double sellingPrice) {
    super(name, description, stock, buyingPrice, sellingPrice);
  }

  public double calculateMarkup() {
    double margin = sellingPrice - buyingPrice;
    double markup = (margin * 100) / buyingPrice;
    return markup;
  }

}