
public abstract class Hero {
    protected String name;
    protected int level;
    protected int attack;
    protected int defense;
    protected int strength;
    protected int dexterity;
    protected int intelligent;
    protected int hp;
    protected Weapons weapons;
    protected Armors armors;

    public Armors getArmors() {
        return armors;
    }

    public void setArmors(Armors armors) {
        this.armors = armors;
    }

    protected Hero(String name){
        this.name= name;

    }
    public abstract void fight(Hero hero);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel() {
        this.level = level;
    }

    public String tauntLine(){
        return "I am ready for anything";
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }
    public void setAttack(){
        this.attack = level;
    }
    public void setDefense(){
        this.defense = level;
    }
    public int getAttack(){
        return attack;
    }
    public int getDefense(){
        return defense;
    }


}