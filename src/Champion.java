public abstract class Champion {

    // 공통 필드
    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defense;

    // 생성자
    public Champion(String name, int hp, int attackDamage, int defense) {
        this.name = name;
        this.hp = hp;
        this.level = 1;
        this.attackDamage = attackDamage;
        this.defense = defense;
    }

    // 공통 메서드
    public void basicAttack(Champion target) {
        target.takeDamage(attackDamage);
        System.out.println(name + " → " + target.name + " 기본 공격");
    }

    public void takeDamage(int damage) {
        int actualDamage = damage - defense;
        if (actualDamage < 0) actualDamage = 0;
        hp -= actualDamage;
        System.out.println(name + "이(가) " + actualDamage + " 피해를 입음");
        System.out.println("(남은 HP: " + hp + ")");
    }

    public void levelUp() {
        level++;
        System.out.println(name + " 레벨업!");
        System.out.println("(현재 레벨: " + level + ")");
    }

    // 추상 메서드
    public abstract void useQ();
}
