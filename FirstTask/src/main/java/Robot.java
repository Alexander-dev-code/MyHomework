public class Robot implements Move {
    private String name;
    private int distance;
    private double jump;

    public Robot(String name, int distance, double jump){
        this.name = name;
        this.distance = distance;
        this.jump = jump;
    }

    @Override
    public void jump() {
        System.out.print(this.name + " jump");
    }

    @Override
    public void run() {
        System.out.print(this.name + " run");
    }

    @Override
    public int getDistance(){
        return this.distance;
    }

    @Override
    public double getJump(){
        return this.jump;
    }
}