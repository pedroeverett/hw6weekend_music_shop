package shop_management;
import behaviours.*;

public class Saxophone extends Instrument implements Playable {

  private int keys;

  public Saxophone (String name, String material, String colour, String type, double buyingPrice, double sellingPrice, int stock, int keys) {
    super(name, material, colour, type, buyingPrice, sellingPrice, stock);
    this.keys = keys;
  }

  public String play() {
    return "fon fon fon";
  }

  public String getType() {
    return this.type;
  }
}