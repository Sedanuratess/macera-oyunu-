package player;

public class Inventory {

    private boolean water;
    private boolean food;
    private boolean firewood;
    private int amount;
    private String weaponName;
    private String armorName;
    private int weaponDamage;
    private int armorDefense;
    
  public int getAmount(){
    return amount;
  }
  public void setAmount(){
this.amount=amount;
      }
  
    public boolean isWater() {
        return water;
    }
   public void setWater(boolean water) {
        this.water = water;
    }
    
    public boolean isFood() {
        return food;
    }
    public void setFood(boolean food) {
        this.food = food;
    public boolean isFirewood() {
        return firewood;
    }
       public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }
    public int getArmorDefence() {
        return armorDefence;
    }
   
    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }
  

    
}
