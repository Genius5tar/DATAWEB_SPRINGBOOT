
package co.edu.udec.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


/**
 *
 * @author PEDRO DE HORTA
 */

@Entity
@Table(name ="usuarios" )
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Usuario {
    
    @Id 
    private int id;
    
    private String username;
    private String nombre;
    private int documento;
    private String password;
    private int user_type;
    
}
