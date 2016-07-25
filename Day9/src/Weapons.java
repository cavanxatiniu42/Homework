
public  class Weapons extends Equipment {
    protected int bonusStrength;
    protected int bonusDexterity;
    protected int bonusIntelligent;
    protected String taunt;
//    public void setTaunt(String weapon){
//        if (getName().equals("Stick")){
//            this.taunt = "You poke your stick for";
//        } else if (getName().equals("Axe")){
//            this.taunt = "You swing your mighty axe for";
//        } else if (getName().equals("Bow")){
//            this.taunt = "you shoot an arrow for";
//        } else if (getName().equals("Staff")){
//            this.taunt = "you cast a spell for";
//        }
//    }

    public int getBonusStrength() {

        System.out.println("hi");
        return bonusStrength;
    }

//    public void setBonusStrength(int bonusStrength) {
//        this.bonusStrength = bonusStrength;
//    }

    public int getBonusIntelligent() {
        return bonusIntelligent;
    }

//    public void setBonusIntelligent(int bonusIntelligent) {
//        this.bonusIntelligent = bonusIntelligent;
//    }

    public int getBonusDexterity() {
        return bonusDexterity;
    }

//    public void setBonusDexterity(int bonusDexterity) {
//        this.bonusDexterity = bonusDexterity;
//    }

    public String getTaunt(){
        return taunt;
    }
}
