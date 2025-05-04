package backend_laboratorio.Setores;

import java.time.LocalDate;
import java.util.List;

import backend_laboratorio.Amostra;
import backend_laboratorio.Testes;

public class AmostraPrototipo extends Amostra {
    private LocalDate dataFabricacao;
    private String numeroLote;
    private String marca;
    private String responsavel;
    private String mcs;

    public AmostraPrototipo(LocalDate dataFabricacao, String numeroLote, String marca, String responsavel, String mcs, String numberRef,
            String modeloRef, List<Testes> testes) {
        super(numberRef, modeloRef, testes);
        this.dataFabricacao = dataFabricacao;
        this.numeroLote = numeroLote;
        this.marca = marca;
        this.responsavel = responsavel;
        this.mcs = mcs;
    }

    @Override
    public String toString() {
        return "AmostraPrototipo(" +
                "dataFabricacao=" + dataFabricacao +
                ", numeroLote=" + numeroLote +
                ", marca=" + marca +
                ", responsavel=" + responsavel +
                ", mcs=" + mcs +
                ", numberRef=" + numberRef +
                ", modeloRef=" + modeloRef +
                ", testes=" + testes +
                ")";
    }
    

}

