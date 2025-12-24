public enum ChampionType {

    ASSASSIN("암살자"),
    FIGHTER("전사"),
    MARKSMAN("원거리"),
    MAGE("마법사"),
    TANK("탱커"),
    SUPPORT("서포터");

    private final String typeName;

    ChampionType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}