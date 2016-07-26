public class Mage extends Hero{
    protected Mage(String name) {
        super(name);
    }

    @Override
    public String tauntLine(){
        return "Mind over matter";
    }
    public void setAttack(Weapons weapons){
        attack += level + weapons.getBonusIntelligent() + weapons.getLevel();
        weapons.getTaunt();
    }
    public void setDefense(Armors armors){
        defense = level + armors.getLevel()+ armors.getBonusIntelligent();
        armors.getTaunt();
    }
}
