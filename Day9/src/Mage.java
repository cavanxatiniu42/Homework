public class Mage extends Hero{
    protected Mage(String name) {
        super(name);
    }

    @Override
    public String tauntLine(){
        return "Mind over matter";
    }
    public void setAttack(Weapons weapons){
      //  weapons.setTaunt(weapons.getName());
        attack += level + weapons.getBonusIntelligent() + weapons.getLevel();
      //  weapons.getTaunt();
    }
    public void setDefense(Armors armors){
        armors.setTaunt(armors.getName());
        if (armors.getTaunt().equals("Robes")){
            defense = level + armors.getLevel()+ intelligent;
        } else {
            defense = level + armors.getLevel();
        }
        armors.getTaunt();
    }
}
