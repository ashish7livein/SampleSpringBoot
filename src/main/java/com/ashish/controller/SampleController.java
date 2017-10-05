package com.ashish.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
 
@RestController
public class SampleController {
    
  @RequestMapping("/")
  public String index() {
    return "Greetings from Spring Boot From Ashish Kumar Ashok!";
  }

  @RequestMapping("/something")
  public String something() {
    return "Here is something and this and that";
  }
}