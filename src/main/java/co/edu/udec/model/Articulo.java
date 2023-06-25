
package co.edu.udec.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


/**
 *
 * @author PEDRO DE HORTA
 */

@Entity
@Table(name ="articulos" )
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Articulo {
    
    @Id
    private int id;
    
    @Column(name="cod", unique = true)
    private int cod;
    private String marca;
    private float p_venta;
    private float p_compra;
    private int iva;
    private String modelo;
    private String proveedor;
    private String tienda;
    private int cantidad;
    private String descripcion;
    private String categoria;

    
}
