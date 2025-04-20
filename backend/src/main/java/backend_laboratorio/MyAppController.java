package backend_laboratorio;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
@CrossOrigin(origins = {"http://localhost:5174"})
public class MyAppController {
  @GetMapping("/hello")
  public String TestandoEndpoint() {
    return "Está funcionando";
  }
}
