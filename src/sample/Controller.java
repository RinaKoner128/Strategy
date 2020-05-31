package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import sample.Metods.*;


public class Controller {
    public TextField unsortedArray;
    public TextField sortedArray;
    int[] mass = new int[10];
    Strategy strategy;

    public void RandomNewArray(ActionEvent actionEvent) {
        unsortedArray.setText("");
        for (int i = 0; i < 10; i++) {
            mass[i] = (int) ((Math.random() * 10) + 1);
            if (i < 9) {
                unsortedArray.setText(unsortedArray.getText() + mass[i] + ",");
            }
            else {unsortedArray.setText(unsortedArray.getText() + mass[i]);}
        }
        System.out.println(mass);
    }

    public void bubbleSort(ActionEvent actionEvent) {
        strategy = new BubbleSort();
        strategy.sort(mass);
        sortedArray.setText(""+strategy.getArray());
    }

    public void insertionSort(ActionEvent actionEvent) {
        strategy = new InsertionSort();
        strategy.sort(mass);
        sortedArray.setText(""+strategy.getArray());
    }

    public void selectionSort(ActionEvent actionEvent) {
        strategy = new SelectionSort();
        strategy.sort(mass);
        sortedArray.setText(""+strategy.getArray());
    }
}
