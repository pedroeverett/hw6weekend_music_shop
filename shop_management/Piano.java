package shop_management;
import behaviours.*;
  

public class Piano implements Playable {
  private String name;
  private int keys;
  private String colour;

  public Piano(String name, int keys, String colour){
    this.name = name;
    this.keys = keys;
    this.colour = colour;
  }

  public String play(){
    return "pin pin pin";
  }
}