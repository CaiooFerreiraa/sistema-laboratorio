package backend_laboratorio.Setores;

import java.time.LocalDate;
import java.util.List;

import backend_laboratorio.Amostra;
import backend_laboratorio.Testes;

public class AmostraPreFabricado extends Amostra {
    private LocalDate dataProducao;
    private String requisitante;
    private String lider;
    private String coordenador;
    private String gerente;
    private String esteira;

    public AmostraPreFabricado(LocalDate dataProducao, String requisitante, String lider, String coordenador, String gerente,
            String esteira, String numberRef, String modeloRef,
            List<Testes> testes) 
    {
        super(numberRef, modeloRef, testes);
        this.dataProducao = dataProducao;
        this.requisitante = requisitante;
        this.lider = lider;
        this.coordenador = coordenador;
        this.gerente = gerente;
        this.esteira = esteira;
    }

    @Override
    public String toString() {
        return "AmostraPreFabricado(" +
                "dataProducao=" + dataProducao +
                ", requisitante=" + requisitante +
                ", lider=" + lider +
                ", coordenador=" + coordenador +
                ", gerente=" + gerente +
                ", esteira=" + esteira +
                ", numberRef=" + numberRef +
                ", modeloRef=" + modeloRef +
                ", testes=" + testes +
                ")";
    }
    

}
