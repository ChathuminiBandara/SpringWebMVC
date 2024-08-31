package lk.ijse.aad.springwebmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mapping")
public class Mapping {
    @GetMapping("hello??")
    public String helloMapping() {
        return "Hello World";
    }

    @GetMapping("postget/*")
    public String getHello(){
        return "Hello World get";
    }


}
