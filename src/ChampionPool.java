import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ChampionPool {

    private Map<String, Champion> pool = new HashMap<>();

    public void addChampion(Champion champion) {
        pool.put(champion.getName(), champion);
    }

    public Optional<Champion> find(String name) {
        return Optional.ofNullable(pool.get(name));
    }

    public Collection<Champion> getAll() {
        return pool.values();
    }
}
