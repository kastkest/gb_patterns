package com.github.kastkest.gb.patterns.data_mapper;

public class RecordNotFoundException extends Exception {
    public RecordNotFoundException(int idPerson) {
        System.out.println("NO such ID");
    }
}
