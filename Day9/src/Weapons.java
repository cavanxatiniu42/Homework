
public class Weapons extends Equipment {
  //  protected String name;
  //  protected int level;
    protected String taunt;
    public void setTaunt(String weapon){
        if (getName().equals("Stick")){
            this.taunt = "You poke your stick for";
        } else if (getName().equals("Axe")){
            this.taunt = "You swing your mighty axe for";
        } else if (getName().equals("Bow")){
            this.taunt = "you shoot an arrow for";
        } else if (getName().equals("Staff")){
            this.taunt = "you cast a spell for";
        }
    }
    public String getTaunt(){
        return taunt;
    }
}
