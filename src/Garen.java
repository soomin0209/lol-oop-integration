public class Garen extends Champion {

    public Garen(String name) {
        super(name, 690, 69, 38);
    }

    @Override
    public void useQ(Champion target) {
        checkAlive();
        target.checkAlive();

        System.out.println(getName() + "의 결정타!(Q)");
        System.out.println("보너스 공격력 20\n");
        target.takeDamage(getAttackDamage() + 20);
    }
}
