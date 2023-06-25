package co.edu.udec.Services;

import co.edu.udec.model.Usuario;
import co.edu.udec.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PEDRO DE HORTA
 */

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository UsuarioRepository;
    
    public Usuario create(Usuario usuario) {
        return UsuarioRepository.save(usuario);
    }
    
    public List<Usuario> readAll() {
       return UsuarioRepository.findAll();
    }
    
    public Usuario readbyid(Integer id)throws Exception{
        Usuario usr =  UsuarioRepository.findById(id).orElse(null);
        if(usr == null){
            throw new Exception("El Usuario ID: "+id+" No Existe en el sistema");     
        }
        return usr;
    }
    
    public void update(Usuario usr){
        UsuarioRepository.save(usr);        
    }
    
    public void delete(Integer id) throws Exception{
        Usuario usr = readbyid(id);
        UsuarioRepository.deleteById(id);
    }
    
    public long contarUsuario (){
        return UsuarioRepository.count();
    }
    
    public boolean existsById(Integer id) throws Exception{
        return UsuarioRepository.existsById(id);
    }
            
            
}
