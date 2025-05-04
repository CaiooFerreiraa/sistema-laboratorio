package backend_laboratorio.Setores;

import java.time.LocalDate;
import java.util.List;

import backend_laboratorio.Amostra;
import backend_laboratorio.Testes;

public class AmostraInjetado extends Amostra {
    private LocalDate dataFabricacao;
    private String numeroLote, mcs;

    public AmostraInjetado(LocalDate dataFabricacao, String numeroLote, String numberRef, String modeloRef, List<Testes> testes, String mcs) {
        super(numberRef, modeloRef, testes);
        this.dataFabricacao = dataFabricacao;
        this.numeroLote = numeroLote;
        this.mcs = mcs;
    }

    @Override
    public String toString() {
        return "AmostraInjetado(" +
                "dataFabricacao=" + dataFabricacao +
                ", numeroLote=" + numeroLote +
                ", numberRef=" + numberRef +
                ", modeloRef=" + modeloRef +
                ", MCS=" + mcs +
                ", testes=" + testes +
                ")";
    }
    

}


