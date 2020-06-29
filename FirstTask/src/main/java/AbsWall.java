public abstract class AbsWall {

    private String name;

    public AbsWall(String name) {
        this.name = name;
    }

    public abstract boolean move(Move someone);

    protected String getName() {
        return name;
    }

}