public class Warrior extends Hero{
    protected Warrior(String name) {
        super(name);
    }
    @Override
    public String tauntLine(){
        return "I AM MIGHTY";
    }
    public void fight(Hero hero) {

    }
    public void setAttack(Weapons weapons){
        weapons.setTaunt(weapons.getName());
        if (weapons.getName().equals("Axe")){
            attack = level+ weapons.getLevel() + strength;
        } else {
            attack = level + weapons.getLevel();
        }
        weapons.getTaunt();
    }
    public void setDefense(Armors armors){
        armors.setTaunt(armors.getName());
        if (armors.getName().equals("Chainmail")){
            defense = level + armors.getLevel()+ strength;
        } else {
            defense = level + armors.getLevel();
        }
        armors.getTaunt();
    }

}
