package com.gucardev.springbootdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

  @GetMapping("/{input}")
  public ResponseEntity<String> sayHello(@PathVariable(required = false) String input) {
    return ResponseEntity.ok("Hello %s !".formatted(input));
  }
}
