
package personal;


public class Persoal {
     private String Telefono;
    private String Correo;

    public Persoal(String Telefono, String Correo) {
        this.Telefono = Telefono;
        this.Correo = Correo;
    }

    public Persoal() {
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTeléfono(String Teléfono) {
        this.Telefono = Teléfono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Telefono=" + Telefono + ", Correo=" + Correo;
    }
    
    
}