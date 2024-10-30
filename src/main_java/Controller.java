package main_java;

import main_java.model.MyList;

public class Controller {
    private MyList myList = new MyList();

    public Controller() {
        // Конструктор можно оставить пустым или удалить, если он не нужен
    }

    public double averageArray(int[] array) {
        return myList.averageArray(array);
    }

    public void compareArray(double resultAverage1, double resultAverage2) {
        myList.compareArray(resultAverage1, resultAverage2);
    }

    public int[] createArray() {
        return myList.createArray();
    }
}
