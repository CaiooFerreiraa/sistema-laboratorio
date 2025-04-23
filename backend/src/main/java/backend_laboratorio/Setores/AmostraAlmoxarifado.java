package backend_laboratorio.Setores;

import java.time.LocalDate;
import java.util.List;

import backend_laboratorio.Amostra;
import backend_laboratorio.Testes;

public class AmostraAlmoxarifado extends Amostra {
    private LocalDate dataEntrega;

    public AmostraAlmoxarifado(LocalDate dataEntrega, String numberRef, String modeloRef, List<Testes> testes) {
        super(numberRef, modeloRef, testes);
        this.dataEntrega = dataEntrega;
    }

    // Getters e setters
}
