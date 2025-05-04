package backend_laboratorio;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import backend_laboratorio.Setores.AmostraBorracha;

public class TestMain {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    List<Testes> testes = Arrays.asList(Testes.ABRASAO_DIN, Testes.DENSIDADE, Testes.DUREZA);


    Amostra m1 = new AmostraBorracha(now, "ASA23524001", "4043", "Trainer", testes);

    System.out.println(m1);
  }
}
