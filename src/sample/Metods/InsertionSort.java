package sample.Metods;

public class InsertionSort implements Strategy {
    public String str = "";

    @Override
    public void sort(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                str += array[i] + ",";
            } else {
                str += array[i];
            }
        }
    }

    @Override
    public String getArray() {
        return str;
    }
}
