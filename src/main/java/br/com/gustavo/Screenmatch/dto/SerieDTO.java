package br.com.gustavo.Screenmatch.dto;

import br.com.gustavo.Screenmatch.Model.Categoria;

public record SerieDTO( Long id,
                        String titulo,
                        Integer totalTemporadas,
                        Double avaliacao,
                        Categoria genero,
                        String atores,
                        String poster,
                        String sinopse) {
}
