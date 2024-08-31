package lk.ijse.aad.springwebmvc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mapping")
public class Mapping {
    @GetMapping("hello??")
    public String helloMapping() {
        return "Hello World";
    }

    @GetMapping("postget/**")
    public String getHello(){
        return "Hello World get";
    }

    @PostMapping("/{name}/{name1}")
    public String mappingpost(@PathVariable ("name") String myname , @PathVariable ("name1") int surname) {
        return "Hello World post " + myname + " lastname " + surname;
    }


}
