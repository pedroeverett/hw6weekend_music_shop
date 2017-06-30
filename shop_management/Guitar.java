package shop_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable {
 
  private int strings;
  private String typeWood;

  public Guitar(String name, String material, String colour, String type, double buyingPrice, double sellingPrice, int stock, int strings, String typeWood) {
    super(name, material, colour, type, buyingPrice, sellingPrice, stock);
    this.strings = strings;
    this.typeWood = typeWood;
  }

  public String play() {
    return "tin tin tin";
  }

  public String getTypeWood() {
    return this.typeWood;
  }

}