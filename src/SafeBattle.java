public class SafeBattle {

    public static void duel(Champion c1, Champion c2) {

        try {
            System.out.println("\n===== 전투 시작 =====");

            c1.basicAttack(c2);
            c2.basicAttack(c1);

            c1.useQ(c2);
            c2.useQ(c1);
        } catch (DeadChampionActionException e) {
            System.out.println("⚠ 전투 종료 (예외 발생): " + e.getMessage());
        }
    }
}
