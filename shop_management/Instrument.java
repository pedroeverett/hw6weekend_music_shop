package shop_management;

public abstract class Instrument {
  protected String name;
  protected String material;
  protected String colour;
  protected InstrumentType type;
  protected double buyingPrice;
  protected double sellingPrice;
  protected int stock;
  protected String description;

  public Instrument(String name, String material, String colour, InstrumentType type, double buyingPrice, double sellingPrice, int stock, String description) {
    this.name = name;
    this.material = material;
    this.colour = colour;
    this.type = type;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
    this.stock = stock;
    this.description = description;
  }
}