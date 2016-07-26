
public class Main {
    public static void main(String[] args) {
       Axe axe =new Axe();
        Bow bow = new Bow();
        axe.setBonusStrength(10);
        axe.setLevel(1);
        Archer archer =new Archer("Archer");
        Warrior warrior = new Warrior("Warrior");

        archer.setAttack(axe);
        System.out.println(archer.getAttack());
        archer.toHero(warrior);
        warrior.setAttack(bow);
        System.out.println(warrior.getAttack());

    }
}
