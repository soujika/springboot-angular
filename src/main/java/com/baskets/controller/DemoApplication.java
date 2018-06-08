package com.baskets.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Package;
import entity.Person;

@Controller
@SpringBootApplication
@RequestMapping(value = "/")
public class DemoApplication {
    Package p ;

    @RequestMapping(value = "/home",  method = RequestMethod.GET, produces = "application/json")
	    @ResponseBody
	    public String home() {
	        return "index";
	    }
	@RequestMapping(value= "/getPackage", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
	public Package getPackage (){
		return new Package(1, "pack1", new Person("f", "n"), Calendar.getInstance().getTime());		
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
