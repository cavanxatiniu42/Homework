
public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void fight(Hero hero) {

    }


    @Override
    public String tauntLine(){
        return "Aim twice, shoot once";
    }
    public void setAttack(Weapons weapons){
        weapons.setTaunt(weapons.getName());
        if (weapons.getName().equals("Bow")){
            attack = level + weapons.getLevel()+ dexterity;
        } else {
            attack = level + weapons.getLevel();
        }
        weapons.getTaunt();
    }
    public void setDefense(Armors armors){
        armors.setTaunt(armors.getName());
        if (armors.getName().equals("Leather")){
            defense = level + weapons.getLevel()+ dexterity;
        } else {
            defense = level + weapons.getLevel();
        }
        armors.getTaunt();
    }


}
