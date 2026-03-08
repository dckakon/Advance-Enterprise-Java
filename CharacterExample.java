// Interface -> static method
interface Subway {
    void left();
    void right();

    static void run() {
        System.out.println("Running .......!");
    }
}

class CharacterExample implements Subway {

    @Override
    public void left() {
        System.out.println("Turning left");
    }

    @Override
    public void right() {
        System.out.println("Turning right");
    }

    public static void main(String[] args) {
        Subway.run(); // Call the static method

        CharacterExample c1 = new CharacterExample();
        c1.left();
        c1.right();
    }
}