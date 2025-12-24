public class SafeBattle {

    public static void duel(Champion c1, Champion c2) {

        try {
            System.out.println("\n===== 전투 시작 =====");

            c1.basicAttack(c2);
            c2.basicAttack(c1);

            c1.useQ(c2);
            c2.useQ(c1);
        } catch (DeadChampionActionException | InsufficientManaException e) {
            System.out.println("⚠ 전투 종료 (예외 발생): " + e.getMessage());
        }
    }

    public static void gameOver(Champion c1, Champion c2) {

        System.out.println("===== 전투 종료 =====");
        System.out.println(c1);
        System.out.println(c2);

        Champion winner = null;
        if (c1.getHp() > c2.getHp()) {
            winner = c1;
        } else if (c1.getHp() < c2.getHp()) {
            winner = c2;
        }

        if (winner != null) {
            System.out.println("\n🏆 " + winner.getName() + " 이(가) 우승했습니다!");
        } else {
            System.out.println("\n⚔️ 무승부입니다!");
        }
    }
}
