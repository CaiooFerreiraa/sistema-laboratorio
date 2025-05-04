package backend_laboratorio;

import java.util.List;

public abstract class Amostra {
    protected String numberRef;
    protected String modeloRef;
    protected List<Testes> testes;

    public Amostra(String numberRef, String modeloRef, List<Testes> testes) {
        this.numberRef = numberRef;
        this.modeloRef = modeloRef;
        this.testes = testes;
    }

    @Override
    public String toString() {
        return "Amostra(numberRef=" + numberRef + ", modeloRef=" + modeloRef + ", testes=" + testes + ")";
    }
    


}