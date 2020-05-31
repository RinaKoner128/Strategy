package sample.Metods;

public class SelectionSort implements Strategy {
    public String str = "";

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
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
