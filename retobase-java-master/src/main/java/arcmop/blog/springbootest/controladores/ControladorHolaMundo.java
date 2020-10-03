package arcmop.blog.springbootest.controladores;

import arcmop.blog.springbootest.entity.Suma;
import arcmop.blog.springbootest.service.SumaService;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ControladorHolaMundo {
    @Resource 
    SumaService sumaService;

    @RequestMapping(value = "/sumar/{sum01}/{sum02}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Map saludar(@PathVariable("sum01") Integer sum01, @PathVariable("sum02") Integer sum02) {
        sumaService.insertSuma(new Suma(sum01, sum02, (sum01 + sum02)));
        return Collections.singletonMap("resultado", String.valueOf(sum01 + sum02));
    }

}
