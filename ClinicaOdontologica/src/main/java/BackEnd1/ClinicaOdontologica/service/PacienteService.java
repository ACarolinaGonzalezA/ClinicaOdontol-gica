package BackEnd1.ClinicaOdontologica.service;

import BackEnd1.ClinicaOdontologica.dao.PacienteDAOH2;
import BackEnd1.ClinicaOdontologica.dao.iDao;
import BackEnd1.ClinicaOdontologica.model.Paciente;

import java.util.List;

public class PacienteService {
private iDao<Paciente> pacienteiDao;

    public PacienteService() {
        pacienteiDao= new PacienteDAOH2();
    }
    //metodos manuales
    public Paciente guardarPaciente(Paciente paciente){
        return pacienteiDao.guardar(paciente);
    }
    public Paciente buscarPorID(Integer id){
        return pacienteiDao.buscarPorId(id);
    }
    public Paciente buscarPorEmail(String email){
        return pacienteiDao.buscarPorString(email);
    }
    public void actualizarPaciente(Paciente paciente){
        pacienteiDao.actualizar(paciente);
    }
    public void eliminarPaciente(Integer id) {
        pacienteiDao.eliminar(id);
    }

    public List<Paciente> buscarTodos() {
        return pacienteiDao.buscarTodos();
    }
}
