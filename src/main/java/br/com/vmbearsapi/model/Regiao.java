package br.com.vmbearsapi.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "regiao")
public class Regiao {

    private String sigla;
    private Geracao geracao;
    private Compra compra;
    private PrecoMedio precoMedio;

    @XmlAttribute
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @XmlElement
    public Geracao getGeracao() {
        return geracao;
    }

    public void setGeracao(Geracao geracao) {
        this.geracao = geracao;
    }

    @XmlElement
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @XmlElement
    public PrecoMedio getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(PrecoMedio precoMedio) {
        this.precoMedio = precoMedio;
    }
}
