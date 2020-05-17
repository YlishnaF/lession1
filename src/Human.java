public class Human implements Move {
    String name;

    int maxHeight;
    int maxRun;
    boolean itCan;


    public Human(String name, int maxHeight, int maxRun) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxRun = maxRun;
        this.itCan = true;

    }

    @Override
    public void run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Человек по имени " + name + " успешно пробежал " + dist + " метров");
        } else {
            System.out.println("Человек по имени " + name + " не справился с дистанцией " + dist + " метров");
            itCan = false;
        }

    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight) {
            System.out.println("Человек по имени " + name + " успешно прыгнул " + height + " метров");
        } else {
            System.out.println("Человек по имени " + name + " не справился с высотой " + height + " метров");
            itCan = false;
        }

    }

    @Override
    public boolean isItCan() {
        return itCan;
    }
}
