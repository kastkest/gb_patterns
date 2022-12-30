package com.github.kastkest.gb.patterns.data_mapper;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    private Connection connection;
    PersonMapper personMapper = new PersonMapper(connection);
    Person person;
    {
        try {
            person = personMapper.findById(1);
        } catch (SQLException | RecordNotFoundException e) {
            e.printStackTrace();
        }
    }
}
