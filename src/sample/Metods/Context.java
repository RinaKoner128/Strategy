package sample.Metods;

public class Context {
    private Strategy strategy;
    private int[] array;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void sortArray(int[] array) {
        strategy.sort(array);
    }
    public int[] getArray() {
        return array;
    }
}