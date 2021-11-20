package com.naved.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class welcomeclass {
@GetMapping("/message")
public String demomsg() {
return "Hello World";
}



}