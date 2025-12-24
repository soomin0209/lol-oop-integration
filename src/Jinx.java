public class Jinx extends Champion implements ManaUser {

    private int mana;

    public Jinx(String name) {
        super(name, 630, 59, 26, ChampionType.MARKSMAN);
        this.mana = 260;
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

        System.out.println(getName() + "의 휘릭휘릭!(Q)");
        checkMana(getName());
        System.out.println("공격력 15 증가, 방어력 5 감소");
        consumeMana(20);
        System.out.println("(남은 마나: " + getMana() + ")");
        setAttackDamage(getAttackDamage() + 15);
        setDefense(getDefense() - 5);
        System.out.println("(현재 공격력: " + getAttackDamage() + ", 현재 방어력: " + getDefense() + ")\n");
    }
}
