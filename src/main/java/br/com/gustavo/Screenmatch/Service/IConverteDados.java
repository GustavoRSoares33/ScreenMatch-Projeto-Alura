package br.com.gustavo.Screenmatch.Service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
