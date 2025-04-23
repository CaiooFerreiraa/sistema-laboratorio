package backend_laboratorio.Setores;

import java.time.LocalDate;
import java.util.List;

import backend_laboratorio.Amostra;
import backend_laboratorio.Testes;

import java.time.LocalDate;

public class AmostraBorracha extends Amostra {
    private LocalDate dataAdicaoEnxofre;
    private String numeroPedido;

    public AmostraBorracha(LocalDate dataAdicaoEnxofre, String numeroPedido, String numberRef, String modeloRef, List<Testes> testes) {
        super(numberRef, modeloRef, testes);
        this.dataAdicaoEnxofre = dataAdicaoEnxofre;
        this.numeroPedido = numeroPedido;
    }

    // Getters e setters
}

