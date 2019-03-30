package com.jakubfilipiak.SpringHelloWorld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Jakub Filipiak on 30.03.2019.
 */
@Component
public class HelloCLR implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
    }
}
