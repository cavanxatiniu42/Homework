
public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }


    @Override
    public String tauntLine(){
        return "Aim twice, shoot once";
    }
    public void setAttack(Weapons weapons){
       attack = level + weapons.getLevel() + weapons.getBonusDexterity();
        weapons.getTaunt();
    }
    public void setDefense(Armors armors){
        defense += level +armors.getLevel()+armors.getBonusIntelligent();
        armors.getTaunt();
    }


}
