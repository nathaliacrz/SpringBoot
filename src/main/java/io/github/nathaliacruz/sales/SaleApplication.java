/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.nathaliacruz.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nath0
 */
@SpringBootApplication
@RestController
public class SaleApplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;
    
    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName;
    }
    public static void main(String[] args) {
        SpringApplication.run(SaleApplication.class, args);
    }
}
