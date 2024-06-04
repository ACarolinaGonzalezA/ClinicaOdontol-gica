package BackEnd1.ClinicaOdontologica.controller;

import BackEnd1.ClinicaOdontologica.model.Paciente;
import BackEnd1.ClinicaOdontologica.service.PacienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //para trabajar sin tecnologia de vista
// @Controller<-- es controller pq vamos a usar una tecnologia de vista

@RequestMapping("/pacientes")
public class PacienteController {
    private PacienteService pacienteService;

    public PacienteController() {
        pacienteService= new PacienteService();
    }
    //ahora vienen todos los metodos que nos permitan actuar como intermediarios.
   /* @GetMapping
    public String buscarPacientePorCorreo(Model model, @RequestParam("email") String email){

        Paciente paciente= pacienteService.buscarPorEmail(email);
        model.addAttribute("nombre",paciente.getNombre());
        model.addAttribute("apellido",paciente.getApellido());
        return "index";

        //return pacienteService.buscarPorEmail(email);
    }*/
    @PostMapping //--> nos permite persistir los datos que vienen desde la vista
    public Paciente guardarPaciente(@RequestBody Paciente paciente){
        return pacienteService.guardarPaciente(paciente);
    }
    @PutMapping
    public String actualizarPaciente(@RequestBody Paciente paciente){

        Paciente pacienteBuscado= pacienteService.buscarPorID(paciente.getId());
        if(pacienteBuscado!=null){
            pacienteService.actualizarPaciente(paciente);
            return "paciente actualizado con exito";
        }else{
            return "paciente no encontrado";
        }

    }
    @GetMapping("/{id}")
    public Paciente buscarPorPaciente(@PathVariable Integer id){
        return pacienteService.buscarPorID(id);
    }
    @DeleteMapping("/{id}")
    public String eliminarPaciente(@PathVariable Integer id) {
        Paciente pacienteBuscado = pacienteService.buscarPorID(id);
        if (pacienteBuscado != null) {
            pacienteService.eliminarPaciente(id);
            return "Paciente eliminado con éxito";
        } else {
            return "Paciente no encontrado";
        }
    }
    @GetMapping
    public List<Paciente> buscarTodos() {
        return pacienteService.buscarTodos();
    }

}
