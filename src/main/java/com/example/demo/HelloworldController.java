package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloworldController {

    @GetMapping("/names")
    public List<String> names(){
        List<String> names=List.of("yagami","ishida","takenouti","izumi","tatikawa","kido","takaishi");
        return names;
    }
}
