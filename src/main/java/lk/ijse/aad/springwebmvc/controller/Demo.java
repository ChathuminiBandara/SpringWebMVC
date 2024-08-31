package lk.ijse.aad.springwebmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //me class eka controller ekk kara,
@RequestMapping("demo")  //mona warge ewada trigger kranna one
public class Demo {
    @GetMapping    //ekata karanna ona mapping eka
    public String healthTest(){
        return "Hello demo";
    }
}
