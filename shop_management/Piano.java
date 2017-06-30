package shop_management;
import behaviours.*;
  

public class Piano extends Instrument implements Playable {
  
  private int keys;
  private int legs;

  public Piano(String name, String material, String colour, String type, double buyingPrice, double sellingPrice, int stock, int keys, int legs){
    super(name, material, colour, type, buyingPrice, sellingPrice, stock);
    this.keys = keys;
    this.legs = legs;
  }

  public String play() {
    return "pin pin pin";
  }

  public String getName() {
    return this.name;
  }
}