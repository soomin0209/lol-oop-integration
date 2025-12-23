public class Jinx extends Champion {

    public Jinx(String name) {
        super(name, 630, 59, 26);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 휘릭휘릭!(Q)");
        System.out.println("공격력 15 증가, 방어력 5 감소");
        setAttackDamage(getAttackDamage() + 15);
        setDefense(getDefense() - 5);
        System.out.println("(현재 공격력: " + getAttackDamage() + ", 현재 방어력: " + getDefense() + ")\n");
    }
}
