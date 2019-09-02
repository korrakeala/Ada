package app;

/**
 * Usuario
 */
public class Usuario {

    public String id;
    public String tipoUsuario;
    private String password;
    public Billetera billetera;

    public void pagar(double monto){

    }

    public void cobrar(double monto){
        
    }

    public void depositar(double monto){
        
    }

    public void extraer(double monto){
        
    }

    public Usuario(String id, String tipoUsuario, String password) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }
}