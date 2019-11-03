package com.serverdatetime.rest.ServerDateTimeApi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.*;
import java.time.format.DateTimeFormatter;

@RestController
@CrossOrigin
public class AppController {

    @RequestMapping(value = "/getdetails")
    public ServerDetails getServerDetails(){
        Instant instant = Instant.now();
        long timeStampM = instant.toEpochMilli();

        return new ServerDetails(String.valueOf(timeStampM));
    };

//    public String init() {
//        Instant instant = Instant.now();
//        long timeStampM = instant.toEpochMilli();
//        return String.valueOf(timeStampM);
//    }
}
