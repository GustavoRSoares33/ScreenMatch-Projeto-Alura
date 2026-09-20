package br.com.gustavo.Screenmatch.Service.Traducao;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosResposta(@JsonAlias("translatedText") String textoTraduzido) {
}
