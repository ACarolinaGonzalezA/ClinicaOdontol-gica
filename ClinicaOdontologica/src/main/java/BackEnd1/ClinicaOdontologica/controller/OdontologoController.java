package BackEnd1.ClinicaOdontologica.controller;

import BackEnd1.ClinicaOdontologica.model.Odontologo;
import BackEnd1.ClinicaOdontologica.service.OdontologoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    private OdontologoService odontologoService;

    public OdontologoController() {

        odontologoService= new OdontologoService();
    }
    @PostMapping
    public Odontologo guardarOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.guardarOdontologo(odontologo);
    }
    @GetMapping("/{id}")
    public Odontologo buscarOdontologoPorId(@PathVariable Integer id) {
        return odontologoService.buscarPorId(id);
    }
    @DeleteMapping("/{id}")
    public void eliminarOdontologo(@PathVariable Integer id) {
        odontologoService.eliminarOdontologo(id);
    }
    @PutMapping
    public void actualizarOdontologo(@RequestBody Odontologo odontologo) {
        odontologoService.actualizarOdontologo(odontologo);
    }
    @GetMapping
    public List<Odontologo> buscarTodos() {
        return odontologoService.buscarTodos();
    }
    @GetMapping("/matricula/{matricula}")
    public Odontologo buscarOdontologoPorMatricula(@PathVariable String matricula) {
        return odontologoService.buscarPorString(matricula);
    }
}
