package backend_laboratorio;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
}
