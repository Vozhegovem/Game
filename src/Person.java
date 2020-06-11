import java.util.Scanner;

public class Person {
    private int numberMarches;

    public void makeStep() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" -Ход игрока. Введите количество спичек: ");
        numberMarches = scanner.nextInt();
        if ((getNumberMarches() > 3) || (getNumberMarches() < 1)){
            System.out.println("Некорректное число спичек! Количество спичек должно быть 1, 2 или 3");
            makeStep();
        }
    }

    public int getNumberMarches() {
        return numberMarches;
    }
}
