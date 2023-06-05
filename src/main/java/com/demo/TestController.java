package com.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class TestController {

    @GetMapping("/testMvcProject")
    @ResponseBody
    public ResponseEntity<?> testIfItOk() {
        return new ResponseEntity<>("everything is working fine", HttpStatus.OK);
    }
}
