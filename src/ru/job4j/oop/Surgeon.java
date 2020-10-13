package ru.job4j.oop;

import java.time.LocalDate;

public class Surgeon extends Doctor {

    private LocalDate lastOperationDate;

    public LocalDate getLastOperationDate() {
        return lastOperationDate;
    }

    public void setLastOperationDate(LocalDate lastOperationDate) {
        this.lastOperationDate = lastOperationDate;
    }

    public void doOperation() {
    }
}
