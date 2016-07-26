public class Warrior extends Hero{

    protected Warrior(String name) {
        super(name);
    }
    @Override
    public String tauntLine(){
        return "I AM MIGHTY";
    }

    public void setAttack(Weapons weapons){
        attack = level+ weapons.getLevel()+ weapons.getBonusStrength();
        weapons.getTaunt();
    }
    public void setDefense(Armors armors){
        defense =level+ armors.getLevel()+armors.getBonusStrength();
        armors.getTaunt();
    }

}
