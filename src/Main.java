public class Main {
    public static void main(String[] args) {
        Move [] movables = {
                new Human("Вася", 2, 5000),
                new Cat("Мурзик", 3, 2000),
                new Robot("C-3PO", 4,10000)
        };

        Obstacle [] obstacles = {
                new RunningTrack(7000),
                new RunningTrack(1000),
                new Wall(1),
                new Wall(3)
        };

        for (Move m: movables) {
            for (Obstacle o: obstacles) {

                o.doIt(m);
                if (!m.isItCan()){
                    break;
                }
                
            }

        }

    }
}
