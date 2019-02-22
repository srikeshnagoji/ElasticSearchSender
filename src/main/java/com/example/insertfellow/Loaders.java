package com.example.insertfellow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

@Component
public class Loaders {

    @Autowired
    CustomerJpaRepository customerJpaRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){

        System.out.println("Loading Data");
        customerJpaRepository.save(new Customers("john","doe","john.doe@gmail.com")); //saves to mysql
        System.out.println(new Timestamp(System.currentTimeMillis()));
        System.out.printf("Loading Completed");
    }


}
