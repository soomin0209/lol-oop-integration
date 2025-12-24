public class Ahri extends Champion implements ManaUser {

    private int mana;

    public Ahri(String name) {
        super(name, 590, 53, 21);
        this.mana = 418;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void useQ(Champion target) {
        checkAlive();
        target.checkAlive();

        System.out.println(getName() + "의 현혹의 구슬!(Q)");
        checkMana(getName());
        consumeMana(55);
        System.out.println("(남은 마나: " + getMana() + ")");
        target.takeDamage(80);
    }
}
