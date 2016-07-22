
public class Armors extends Equipment{
   // protected int level;
    protected String taunt;
    public void setTaunt(String armor){
        if (getName().equals("Clothes")){
            this.taunt = "Your normal clothes blocks the attack";
        } else if (getName().equals("Chainmail")){
            this.taunt = "Your mighty chainmail blocks the attack";
        } else if (getName().equals("Leather")){
            this.taunt = "your sneaky armor allow you to dodge the attack";
        } else if (getName().equals("Robes")){
            this.taunt = "your magical robes protect you from the attack";
        }
    }
    public String getTaunt(){
        return taunt;
    }
}
