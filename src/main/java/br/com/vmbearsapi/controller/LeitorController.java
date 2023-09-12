package br.com.vmbearsapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "leitor")
public class LeitorController {

    @PostMapping(value = "/lerXML")
    public void lerXML(@RequestBody MultipartFile arquivo) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("teste");
    }

}
