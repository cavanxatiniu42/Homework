/**
 * Created by Thu Thuy Nguyen on 7/25/2016.
 */
public class Axe extends Weapons {
    private int bounsStrength;
    public Axe(){}
    public void setBonusStrength(int bonusStrength){
        this.bounsStrength =bonusStrength;

    }
    public int getBonusStrength(){
        System.out.println("hi2");
        return bounsStrength;
    }
}
