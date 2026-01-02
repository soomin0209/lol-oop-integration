public interface ManaUser {
    int getMana();
    void setMana(int mana);

    default void checkMana(String name) {
        if (getMana() <= 0) {
            throw new InsufficientManaException(name + "의 마나가 부족합니다!\n");
        }
    }
}
