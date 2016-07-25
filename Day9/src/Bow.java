/**
 * Created by Thu Thuy Nguyen on 7/25/2016.
 */
public class Bow extends Weapons {
    private int bonusDexterity;
    public Bow(){}
    public void setBounsDexterity(){
        this.bonusDexterity =5;
    }
    public int getBonusDexterity(){
        return bonusDexterity;
    }
}
