package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import sample.Metods.BubbleSort;
import sample.Metods.Context;
import sample.Metods.InsertionSort;
import sample.Metods.SelectionSort;


public class Controller {
    public TextField unsortedArray;
    public TextField sortedArray;
    int[] mass = new int[10];
    Context context;

    public void RandomNewArray(ActionEvent actionEvent) {
        unsortedArray.setText("");
        for (int i = 0; i < 10; i++) {
            mass[i] = (int) ((Math.random() * 10) + 1);
            if (i < 9) {
                unsortedArray.setText(unsortedArray.getText() + mass[i] + ",");
            }
            else {unsortedArray.setText(unsortedArray.getText() + mass[i]);}
        }
    }

    public void bubbleSort(ActionEvent actionEvent) {
        context = new Context(new BubbleSort());
        context.sortArray(mass);

    }

    public void insertionSort(ActionEvent actionEvent) {
        context = new Context(new InsertionSort());
        context.sortArray(mass);
    }

    public void selectionSort(ActionEvent actionEvent) {
        context = new Context(new SelectionSort());
        context.sortArray(mass);
    }
}
