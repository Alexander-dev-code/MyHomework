class RunningTrack extends AbsWall {

    private double length;

    public RunningTrack(String name, double length) {
        super(name);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean move(Move someone) {
        System.out.println(super.getName() + " Track length: " + length);
        someone.run();
        if (getLength() <= someone.getDistance()){
            System.out.println(" - sprint completed successfully");
            return true;
        }
        System.out.println(" - sprint completed unsuccessfully");
        return false;
    }
}