package br.com.vmbearsapi.controller;

import br.com.vmbearsapi.model.Agente;
import br.com.vmbearsapi.model.Agentes;
import br.com.vmbearsapi.service.LeitorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
@RequestMapping(value = "leitor")
public class LeitorController {

    private LeitorService leitorService;

    @PostMapping(value = "/lerXML")
    public void lerXML(@RequestParam("arquivo") MultipartFile arquivo) throws InterruptedException {
        Agentes agentes = leitorService.processarXML(arquivo);
        //Thread.sleep(2000);
        for (Agente agente : agentes.getAgente()) {
            System.out.println(agente.getCodigo());
        }
    }

}
