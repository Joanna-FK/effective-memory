package pl.sda.joanna.exercise.queue;
//Stwórz nową klasę MyQueue<T>. T będzie tzw. typem generycznym. Powinna zawierać metody offer(T t) dodającą do  kolejki nowy
// obiekt i metodę pool() która będzie zwracać obiekt klasy T. Kolejka powinna działać na zasadzie FIFO. Obiekty wewnątrz tej
// klasy przechowuj w ArrayList<T>. Dodaj metodę printAll() która będzie drukować do konsoli efekt wywołania toString() na każdym
// obiekcie pozostałym w kolejce.

import java.util.ArrayList;
import java.util.List;

public class MyQueue <T>{

   private List<T> underlyingList = new ArrayList<>();

    public void offer (T someObject){
    underlyingList.add(someObject);
    }

    public T pool(){
        return underlyingList.remove(0);
    }

    public void printAll(){
        for (T obj: underlyingList) {
            System.out.println(obj.toString());
        }
    }
}
