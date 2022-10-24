
package hospital;

public class Especialidad {
     private int codEspecialidad;
    private String nomEspecialidad;

    public Especialidad(int codEspecialidad, String nomEspecialidad) {
        this.codEspecialidad = codEspecialidad;
        this.nomEspecialidad = nomEspecialidad;
    }

    public int getCodEspecialidad() {
        return codEspecialidad;
    }

    public String getNomEspecialidad() {
        return nomEspecialidad;
    }
}
