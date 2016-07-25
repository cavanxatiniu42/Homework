public class Warrior extends Hero{

    protected Warrior(String name) {
        super(name);
    }
    @Override
    public String tauntLine(){
        return "I AM MIGHTY";
    }

    public void setAttack(Weapons weapons){
       // weapons.setTaunt(weapons.getName());
        attack = level+ weapons.getLevel()+ weapons.getBonusStrength();
     //   weapons.getTaunt();
    }
    public void setDefense(Armors armors){
      //  armors.setTaunt(armors.getName());
        defense =level+ armors.getLevel()+weapons.getBonusStrength();
       // armors.getTaunt();
    }

}
