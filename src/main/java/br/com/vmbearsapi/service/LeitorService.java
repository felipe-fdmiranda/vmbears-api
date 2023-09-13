package br.com.vmbearsapi.service;

import br.com.vmbearsapi.model.Agentes;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;

@Service
public class LeitorService {

    public Agentes processarXML(MultipartFile arquivo) {
        try {
            InputStream inputStream = arquivo.getInputStream();
            JAXBContext jaxbContext = JAXBContext.newInstance(Agentes.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Agentes) unmarshaller.unmarshal(inputStream);
        } catch (IOException | JAXBException e) {
            throw new RuntimeException("Erro ao processar o arquivo XML.", e);
        }
    }

}
