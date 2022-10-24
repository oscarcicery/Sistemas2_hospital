
package hospital;


public class Persona {
    private int id;
    private String nombres;
    private String apellidos;
    private String genero;
    private String direccion;
    private String email;

    public Persona(int id, String nombres, String apellidos, String genero, String direccion, String email) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.direccion = direccion;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }
}
