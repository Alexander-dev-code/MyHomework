public class Wall extends AbsWall {

    private double length;

    public Wall(String name, double length) {
        super(name);
        this.length = length;
    }

    protected double getLength() {
        return this.length;
    }

    @Override
    public boolean move(Move someone) {
        System.out.println(super.getName() + " wall height: " + length);
        someone.jump();
        if (getLength() <= someone.getJump()){
            System.out.println(" - Jumped over");
            return true;
        }
        System.out.println(" - Not jumped");
        return false;
    }
}

