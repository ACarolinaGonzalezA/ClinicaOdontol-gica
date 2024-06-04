package BackEnd1.ClinicaOdontologica;

import BackEnd1.ClinicaOdontologica.dao.BD;
import BackEnd1.ClinicaOdontologica.model.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import BackEnd1.ClinicaOdontologica.service.PacienteService;

public class PacienteServiceTest {
    @Test
    public void buscarPacientePorID(){
        BD.crearTablas();
        PacienteService pacienteService= new PacienteService();
        Integer id=2;
        Paciente paciente= pacienteService.buscarPorID(id);
        Assertions.assertTrue(paciente!=null);
    }
}
