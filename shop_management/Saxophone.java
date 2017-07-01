package shop_management;
import behaviours.*;

public class Saxophone extends Instrument implements Playable, Sellable {

  private int keys;

  public Saxophone (String name, String material, String colour, String type, double buyingPrice, double sellingPrice, int stock, int keys, String description) {
    super(name, material, colour, type, buyingPrice, sellingPrice, stock, description);
    this.keys = keys;
  }

  public String play() {
    return "fon fon fon";
  }

  public String getType() {
    return this.type;
  }

  public double calculateMarkup() {
    double margin = sellingPrice - buyingPrice;
    double markup = (margin * 100) / buyingPrice;
    return markup;
}
}