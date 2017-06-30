package shop_management;

public abstract class Instrument {
  protected String name;
  protected String material;
  protected String colour;
  protected String type;
  protected double buyingPrice;
  protected double sellingPrice;
  protected int stock;

  public Instrument(String name, String material, String colour, String type, double buyingPrice, double sellingPrice, int stock) {
    this.name = name;
    this.material = material;
    this.colour = colour;
    this.type = type;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
    this.stock = stock;
  }
}