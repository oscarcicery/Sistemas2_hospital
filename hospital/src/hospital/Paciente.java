
package hospital;

public class Paciente extends Persona{
     private String fNaciminento;
    private String estadoCivil;

    public Paciente(String fNaciminento, String estadoCivil, int id, String nombres, String apellidos, String genero, String direccion, String email) {
        super(id, nombres, apellidos, genero, direccion, email);
        this.fNaciminento = fNaciminento;
        this.estadoCivil = estadoCivil;
    }

    

    public String getfNaciminento() {
        return fNaciminento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

}
