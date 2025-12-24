public class Main {
    public static void main(String[] args) {

        Champion garen = new Garen("가렌");
        Champion jinx = new Jinx("징크스");
        Champion ahri = new Ahri("아리");

        ChampionPool pool = new ChampionPool();
        pool.addChampion(garen);
        pool.addChampion(jinx);
        pool.addChampion(ahri);

        pool.find("가렌")
                .ifPresentOrElse(
                        c -> System.out.println(c),
                        () -> System.out.println("존재하지 않는 챔피언입니다.")
                );

        SafeBattle.duel(jinx, ahri);
    }
}