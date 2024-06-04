package BackEnd1.ClinicaOdontologica.service;

import BackEnd1.ClinicaOdontologica.dao.OdontologoDAOH2;
import BackEnd1.ClinicaOdontologica.dao.iDao;
import BackEnd1.ClinicaOdontologica.model.Odontologo;
import BackEnd1.ClinicaOdontologica.model.Paciente;

import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        odontologoiDao= new OdontologoDAOH2();
    }
    //aca debemos poner todos los metodos manuales
    public  Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoiDao.guardar(odontologo);
    }
    public Odontologo buscarPorId(Integer id){
        return odontologoiDao.buscarPorId(id);
    }
    public List<Odontologo>buscarTodos(){
        return odontologoiDao.buscarTodos();
    }
    public void eliminarOdontologo(Integer id) {
        odontologoiDao.eliminar(id);
    }
    public void actualizarOdontologo(Odontologo odontologo) {
        odontologoiDao.actualizar(odontologo);
    }
    public Odontologo buscarPorString(String matricula) {
        return odontologoiDao.buscarPorString(matricula);
    }

}


