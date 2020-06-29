import java.util.Random;

public class Start {

    public static void main(String[] args) {

        Random random = new Random();
        Move[] members = new Move[3];
        int way = random.nextInt(300);
        double jump = random.nextDouble() * 4;
        members[0] = new Human("Human", way, jump);

        way = random.nextInt(200);
        jump = random.nextDouble() * 3;
        members[1] = new Cat("Cat", way, jump);

        way = random.nextInt(500);
        jump = random.nextDouble() * 5;
        members[2] = new Robot("Robot", way, jump);

        AbsWall[] absWalls = new AbsWall[4];
        for (int i = 0; i < absWalls.length; i++)
            if (i % 2 == 0) {
                double length = 100;
                if (i == 2) {
                    length = length * 0.5;
                }
                //length = Math.round(length);
                absWalls[i] = new RunningTrack( "Way¹" + (i + 1), length );
            } else {
                double length = 0.5;
                if (i == 3) {
                    length = length + 1;
                }
                absWalls[i] = new Wall( "Way¹" + (i + 1), length );
            }
        for (Move member : members) {
            boolean result = true;
            for (AbsWall absWall : absWalls) {
                if (member instanceof Human) {
                    result = absWall.move( member );
                }
                if (member instanceof Cat) {
                    result = absWall.move( member );
                }
                if (member instanceof Robot) {
                    result = absWall.move( member );
                }
                if (!result) {
                    break;
                }
            }
        }
    }
}
