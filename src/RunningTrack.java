public class RunningTrack extends Obstacle{
    int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Move move) {
        move.run(distance);
    }


}

