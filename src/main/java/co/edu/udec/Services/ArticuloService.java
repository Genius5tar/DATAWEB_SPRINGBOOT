package co.edu.udec.Services;

import co.edu.udec.model.Articulo;
import co.edu.udec.repository.ArticuloRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PEDRO DE HORTA
 */

@Service
public class ArticuloService {
    
    @Autowired
    private ArticuloRepository ArticuloRepository;
    
    public Articulo create(Articulo articulo) {
        return ArticuloRepository.save(articulo);
    }
    
    public List<Articulo> readAll() {
       return ArticuloRepository.findAll();
    }
    
    public Articulo readbyid(Integer id) throws Exception{
        Articulo art =  ArticuloRepository.findById(id).orElse(null);
        if(art == null){
            throw new Exception("El Usuario ID: "+id+" No Existe en el sistema");     
        }
        return art;
    }
        
    public void update(Articulo art){
        ArticuloRepository.save(art);
    }
    
    public void delete(Integer id) throws Exception{
        Articulo art = readbyid(id);
        ArticuloRepository.deleteById(id);
    }

    public long contarArticulos (){
        return ArticuloRepository.count();
    }
    
    public boolean existsById(Integer id) throws Exception{
        return ArticuloRepository.existsById(id);
    }
            
}
