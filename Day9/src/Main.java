
public class Main {
    public static void main(String[] args) {
       Axe axe =new Axe();
        axe.setBonusStrength(10);
        axe.setLevel(1);
        Archer archer =new Archer("Archer");
        archer.setAttack(axe);
        System.out.println(archer.getAttack());

    }
}
