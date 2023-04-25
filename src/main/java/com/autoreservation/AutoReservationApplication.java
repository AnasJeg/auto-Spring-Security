package com.autoreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AutoReservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoReservationApplication.class, args);
        System.out.println("Done");
    }

    @GetMapping("test")
    public ResponseEntity<String> Test(){
        return ResponseEntity.ok("Hey");
    }


}
