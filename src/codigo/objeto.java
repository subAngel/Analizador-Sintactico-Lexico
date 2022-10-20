package codigo;

public class objeto{
    String nombre, valor, tipo;
    public String toString(){
        return String.format("|   %s   |   %s   |   %s   |", nombre, valor, tipo);
    }
    public objeto (String pnombre, String ptipo){
        nombre = pnombre;
        tipo = ptipo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
    public String getValor(){
        return valor;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
}