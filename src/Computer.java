public class Computer{
    private int numberMarches;
    private boolean isComputer = true;

    public void makeStep(int numberOfMatches) {
        numberMarches = (numberOfMatches - 1) % 4;
        System.out.println(" -Колличество выбранных компьютером спичек = " + numberMarches);
        isComputer = false;
    }

    public int getNumberMarches() {
        return numberMarches;
    }

    public boolean isComputer() {
        return isComputer;
    }

    public void setComputer(boolean computer) {
        isComputer = computer;
    }
}
