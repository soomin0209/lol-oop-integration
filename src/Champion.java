import java.util.Random;

public abstract class Champion {

    // 공통 필드
    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defense;
    private static int createdCount = 0;
    private Random random = new Random();
    private ChampionType type;

    // 생성자
    public Champion(String name, int hp, int attackDamage, int defense, ChampionType type) {
        this.name = name;
        this.hp = hp;
        this.level = 1;
        this.attackDamage = attackDamage;
        this.defense = defense;
        this.type = type;
        createdCount++; // Champion 생성 시 createdCount 증가
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getDefense() {
        return defense;
    }

    public ChampionType getType() {
        return type;
    }

    public static int getCreatedCount() {
        return createdCount;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // 공통 메서드
    public void basicAttack(Champion target) {
        checkAlive();
        target.checkAlive();

        int randomDamage = attackDamage;
        int minDamage = (int)(attackDamage * 1.5);  // 1.5배
        int maxDamage = attackDamage * 2;   // 2배

        System.out.println(name + " → " + target.name + " 기본 공격");
        // 20%의 확률로 치명타 발동
        if (random.nextDouble() < GameConstants.CRITICAL_CHANCE) {
            randomDamage = random.nextInt(maxDamage - minDamage + 1) + minDamage;
            System.out.println("치명타 " + randomDamage + "!");
        }
        target.takeDamage(randomDamage);
    }

    public void takeDamage(int damage) {
        int actualDamage = damage - defense;
        if (actualDamage < 0) actualDamage = 0;
        hp -= actualDamage;
        System.out.println(name + " 이(가) " + actualDamage + " 피해를 입음");
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " 이(가) 사망했습니다!");
        }
        System.out.println("(남은 HP: " + hp + ")\n");
    }

    public void levelUp() {
        checkAlive();

        if (level >= GameConstants.MAX_LEVEL) {
            System.out.println(name + " 이(가) 이미 최대 레벨입니다");
        } else {
            level++;
            hp += 120;
            attackDamage += 5;
            defense += 5;
            System.out.println(name + " 레벨업!");
            System.out.println("(현재 레벨: " + level + ")");
        }
    }

    protected void checkAlive() {
        if (hp <= 0) {
            throw new DeadChampionActionException(name + " 은(는) 이미 사망했습니다!");
        }
    }

    // 추상 메서드
    public abstract void useQ(Champion target);

    @Override
    public String toString() {
        return "이름: " + name +
                ", 레벨: " + level +
                ", 체력: " + hp +
                ", 공격력: " + attackDamage +
                ", 방어력: " + defense;
    }
}
