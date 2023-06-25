/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.controler;


import org.springframework.ui.Model;
import co.edu.udec.Services.ArticuloService;
import co.edu.udec.Services.UsuarioService;
import co.edu.udec.model.Articulo;
import co.edu.udec.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author PEDRO DE HORTA
 */

@Controller
public class Controller_App {
     
    @Autowired
    private ArticuloService artService;    
    
    //para controlar la ruta del proceso de login

    /*
    @GetMapping({"/"})
    public String Login (Model modelo){
    return "/Login/index";
    }
    */
    
    //para controlar la ruta del Principal Page
    
    @GetMapping({"/Principal"})
    public String Principal (Model modelo){
    return "/index";
    }
    
    //para controlar las rutas de la entidad de los Articulos    
    @GetMapping({"/Articulos/agregar"})
    public String form_agregar(Model modelo){
    Articulo articulo = new Articulo();
    modelo.addAttribute("articulo", articulo);
    return "/Articulos/agregar";
    }  
    @PostMapping({"/Articulos/add"})
    public String agregar_Articulos(@ModelAttribute("articulo") Articulo articulo){
    artService.create(articulo);
    return "redirect:/Articulos";
    }  
    @GetMapping({"/Articulos"})
    public String listar_Articulos(Model modelo){
    modelo.addAttribute("Articulos", artService.readAll());
    return "/Articulos/listar";
    }
    @GetMapping({"/Articulos/editar/{id}"})
    public String form_editar(@PathVariable Integer id, Model modelo) throws Exception{
    modelo.addAttribute("Articulos", artService.readbyid( id));
    return "/Articulos/editar";
    } 
    @PostMapping({"/Articulos/{id}"})
    public String editar_Articulos(@PathVariable Integer id, @ModelAttribute("Articulos") Articulo articulo, Model modelo) throws Exception{
    Articulo artExist = artService.readbyid(id);    
    artExist.setId(articulo.getId());
    artExist.setCod(articulo.getCod());
    artExist.setMarca(articulo.getMarca());
    artExist.setP_venta(articulo.getP_venta());
    artExist.setP_compra(articulo.getP_compra());
    artExist.setIva(articulo.getIva());
    artExist.setModelo(articulo.getModelo());
    artExist.setProveedor(articulo.getProveedor());
    artExist.setTienda(articulo.getTienda());
    artExist.setCantidad(articulo.getCantidad());
    artExist.setDescripcion(articulo.getDescripcion());
    artExist.setCategoria(articulo.getCategoria());
    artExist.setIva(articulo.getIva());   
    artService.update(artExist);
    return "redirect:/Articulos";
    }
    @GetMapping({"/Articulos/eliminar/{id}"})
    public String eliminar_Articulos(@PathVariable Integer id) throws Exception{
    artService.delete(id);
    return "redirect:/Articulos";
    }
    
//para controlar las rutas de la entidad de los Usuarios
    
    @Autowired
    private UsuarioService usrService;
    
    @GetMapping({"/Usuarios/agregar"})
    public String form_agregar_usr(Model modelo){
    Usuario usuario = new Usuario();
    modelo.addAttribute("usuario", usuario);
    return "/Usuarios/agregar";
    }  
    @PostMapping({"/Usuarios/add"})
    public String agregar_Usuario(@ModelAttribute("usuario") Usuario usuario) throws Exception{
    usrService.create(usuario);
    return "redirect:/Usuarios";
    }  
    @GetMapping({"/Usuarios"})
    public String listar_Usuarios(Model modelo){
    modelo.addAttribute("Usuarios", usrService.readAll());
    return "/Usuarios/listar";
    }
    @GetMapping({"/Usuarios/editar/{id}"})
    public String form_editar_usr(@PathVariable Integer id, Model modelo) throws Exception{
    modelo.addAttribute("Usuarios", usrService.readbyid( id));
    return "/Usuarios/editar";
    } 
    @PostMapping({"/Usuarios/{id}"})
    public String editar_Usuarios(@PathVariable Integer id, @ModelAttribute("Usuarios") Usuario usuario, Model modelo) throws Exception{
    Usuario usrExist = usrService.readbyid(id);    
    usrExist.setId(usuario.getId());
    usrExist.setUsername(usuario.getUsername());
    usrExist.setNombre(usuario.getNombre());
    usrExist.setDocumento(usuario.getDocumento());
    usrExist.setPassword(usuario.getPassword());
    usrExist.setUser_type(usuario.getUser_type());
    usrService.update(usrExist);
    return "redirect:/Usuarios";
    }
    @GetMapping({"/Usuarios/eliminar/{id}"})
    public String eliminar_Usuarios(@PathVariable Integer id) throws Exception{
    usrService.delete(id);
    return "redirect:/Usuarios";
    }
}

