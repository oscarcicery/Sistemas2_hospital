
package hospital;


public class Medico extends Persona{
     private int codEspecialidad;

    public Medico(int codEspecialidad, int id, String nombres, String apellidos, String genero, String direccion, String email) {
        super(id, nombres, apellidos, genero, direccion, email);
        this.codEspecialidad = codEspecialidad;
    }

    

    public int getCodEspecialidad() {
        return codEspecialidad;
    }
}
