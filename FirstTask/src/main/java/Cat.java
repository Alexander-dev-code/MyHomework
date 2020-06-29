public class Cat implements Move {
    private String name;
    private int distance;
    private double jump;

    public Cat(String name, int distance, double jump){
        this.name = name;
        this.distance = distance;
        this.jump = jump;
    }

    @Override
    public void jump() {
        System.out.print(name + " jump");
    }

    @Override
    public void run() {
        System.out.print(name + " run");
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
