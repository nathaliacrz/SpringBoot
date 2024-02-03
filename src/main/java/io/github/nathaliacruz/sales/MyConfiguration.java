/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nathaliacruz.sales;

import io.github.nathaliacruz.sales.service.DevelopmentConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author nath0
 */
@DevelopmentConfiguration
@Configuration
public class MyConfiguration {

     @Bean(name = "applicationName")
    public String applicationName() {
        return "applicationName"; // Provide the actual application name here
    }
}

