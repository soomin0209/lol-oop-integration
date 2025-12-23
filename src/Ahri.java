public class Ahri extends Champion {

    public Ahri(String name) {
        super(name, 590, 53, 21);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 현혹의 구슬!(Q)");
        target.takeDamage(80);
    }
}
