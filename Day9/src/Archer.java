
public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }


    @Override
    public String tauntLine(){
        return "Aim twice, shoot once";
    }
    public void setAttack(Weapons weapons){
//        weapons.setTaunt(weapons.getName());
       attack = level + weapons.getLevel() + weapons.getBonusDexterity();
     //   weapons.getTaunt();
    }
    public void setDefense(Armors armors){
        armors.setTaunt(armors.getName());
        defense += level +weapons.getLevel()+weapons.getBonusIntelligent();
        armors.getTaunt();
    }


}
