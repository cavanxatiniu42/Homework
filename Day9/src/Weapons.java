
public  class Weapons extends Equipment {
    protected int bonusStrength;
    protected int bonusDexterity;
    protected int bonusIntelligent;
    protected String taunt;

    public int getBonusStrength() {
        return bonusStrength;
    }


    public int getBonusIntelligent() {
        return bonusIntelligent;
    }

    public int getBonusDexterity() {
        return bonusDexterity;
    }
    public void setTaunt(String taunt){
        this.taunt = taunt;
    }

    public String getTaunt(){
        return taunt;
    }
}
