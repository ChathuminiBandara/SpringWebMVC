package lk.ijse.aad.springwebmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //me class eka controller ekk kara,
@RequestMapping("demo")  //mona warge ewada trigger kranna one , class ekata adala url
public class Demo {
    @GetMapping    //ekata karanna ona mapping eka
    public String healthTest(){
        return "Hello demo get";
    }

    @GetMapping("other")
    public String healthTest2(){
        return "Hello demo get2";
    }

    @PostMapping
    public String healthTestPost(){
        return "Hello demo post";
    }
}
