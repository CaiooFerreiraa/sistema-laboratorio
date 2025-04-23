package backend_laboratorio.Setores;

import java.time.LocalDate;
import java.util.List;

import backend_laboratorio.Amostra;
import backend_laboratorio.Testes;

import java.time.LocalDate;

public class AmostraInjetado extends Amostra {
    private LocalDate dataFabricacao;
    private String numeroLote;

    public AmostraInjetado(LocalDate dataFabricacao, String numeroLote, String numberRef, String modeloRef, List<Testes> testes) {
        super(numberRef, modeloRef, testes);
        this.dataFabricacao = dataFabricacao;
        this.numeroLote = numeroLote;
    }

    // Getters e setters
}


