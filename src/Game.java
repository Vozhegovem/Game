public class Game {
    public static void main(String[] args) {
        int init = 20;
        Computer computer = new Computer();
        Person person = new Person();
        while(init != 1) {
            System.out.println("На столе осталост: " + init + " спичек.");
            if (computer.isComputer()) {
                computer.makeStep(init);
                init -= computer.getNumberMarches();
                if (init == 1) {
                    System.out.println("Для игрока осталась последняя спичка. Игрок проиграл");
                }
            } else {
                person.makeStep();
                init -= person.getNumberMarches();
                computer.setComputer(true);
            }
        }
    }
}
