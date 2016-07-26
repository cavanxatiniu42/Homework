
public abstract class Armors extends Equipment{
    protected int bonusStrength;
    protected int bonusIntelligent;
    protected int bonusDexterity;

    protected String taunt;

    public void setTaunt(String taunt){
        this.taunt = taunt;
    }
    public String getTaunt(){
        return taunt;
    }
    public int getBonusStrength(){
        return bonusStrength;
    }
    public int getBonusIntelligent(){
        return bonusIntelligent;
    }
    public int getBonusDexterity(){
        return bonusDexterity;
    }
}
