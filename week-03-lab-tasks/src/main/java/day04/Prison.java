package day04;

public class Prison {

    private boolean[] cells = new boolean[100];

    public void openFreeCells() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = i; j < cells.length; j++) {
                if ((j + 1) % (i + 1) == 0) {
                    cells[j] = !cells[j];
                }
            }
        }
    }

    public boolean[] getCells() {
        return cells;
    }
}