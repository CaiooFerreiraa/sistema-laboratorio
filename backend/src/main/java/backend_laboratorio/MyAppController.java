package backend_laboratorio;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
@CrossOrigin(origins = {"http://localhost:8080"})
public class MyAppController {

  @GetMapping("/get_amostra")
  public Boolean ResgatarAmostra() {
    return true;
  }

  @PostMapping("/cad_amostra")
  public String CadastrarAmostra(String tes) {
    return "Ola, está funcionando" + " " + tes;
  }

  @PutMapping("/att_amostra")
  public String AtualizarAmostra() {
    return "Está funcionando a rota de atualização";
  }

  @DeleteMapping("/dele_amostra")
  public String DeletandoAmostra(@RequestBody Funcionario func) {
    if (!func.type.equals("gerente")) {
      return "Este funcionário não é um gerente e não pode excluir";
    }

    return "Este funcionário é um gerente e pode excluir";
  }
}
