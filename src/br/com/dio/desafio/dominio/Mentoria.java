package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Locale;

public class Mentoria extends Conteudo {
    private String descricao;
    private String titulo;
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "descricao='" + getDescricao() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", data=" + getData() +
                '}';
    }
}

