package com.ermanetwork.errorhandle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testservis")
public class TestController {

    @RequestMapping(value = "/testws", method = RequestMethod.GET)
    public String getMerhabaDunya(@RequestParam String adSoyad){
        return "Merhaba Dünya " + adSoyad;
    }
}
