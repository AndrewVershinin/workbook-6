package com.pluralsight.collection;

import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail
        System.out.println(numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
//        dates.add(15); // this line should fail
        dates.add(LocalDate.now());
        System.out.println(dates.getItems().size());
        for (LocalDate date : dates.getItems()) {
            System.out.println(date);
        }

    }
}
