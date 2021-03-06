public class Cat implements Move{
    String name;

    int maxHeight;
    int maxRun;

    boolean itCan;


    public Cat(String name, int maxHeight, int maxRun) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxRun = maxRun;
        this.itCan = true;

    }

    @Override
    public void run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Кот по имени " + name + " успешно пробежал " + dist + " метров");
        } else {
            System.out.println("Кот по имени " + name + " не справился с дистанцией " + dist + " метров");
            itCan = false;
        }

    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight) {
            System.out.println("Кот по имени " + name + " успешно прыгнул " + height + " метров");
        } else {
            System.out.println("Кот по имени " + name + " не справился с высотой " + height + " метров");
        }

    }

    @Override
    public boolean isItCan() {
        return itCan;
    }
}
