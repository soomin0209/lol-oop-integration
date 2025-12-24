import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("📢 소환사의 협곡에 오신 것을 환영합니다 📢");

        Champion garen = new Garen("가렌");
        Champion jinx = new Jinx("징크스");
        Champion ahri = new Ahri("아리");

        System.out.println("\n🧙 생성된 챔피언: ");
        System.out.println(garen.getName() + " - " + garen.getType().getTypeName());
        System.out.println(jinx.getName() + " - " + jinx.getType().getTypeName());
        System.out.println(ahri.getName() + " - " + ahri.getType().getTypeName());

        System.out.println("\n👥 총 챔피언 수: " + Champion.getCreatedCount());
        System.out.println("⭐ 최대 레벨: " + GameConstants.MAX_LEVEL);
        System.out.println("⏱️ 기본 CDR: " + GameConstants.BASE_CDR);

        // 챔피언 Pool 생성
        ChampionPool pool = new ChampionPool();
        pool.addChampion(garen);
        pool.addChampion(jinx);
        pool.addChampion(ahri);

        // 랜덤 선택으로 2명 선택
        Random random = new Random();
        List<Champion> poolList = new ArrayList<>(pool.getAll());
        Champion c1 = poolList.get(random.nextInt(poolList.size()));
        Champion c2;
        do {
            c2 = poolList.get(random.nextInt(poolList.size()));
        } while (c1 == c2);

        // 안전 전투(SafeBattle) 진행
        SafeBattle.duel(c1, c2);

        // 승패 또는 전투 종료 메시지 출력
        SafeBattle.gameOver(c1, c2);
    }
}