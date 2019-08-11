
package modelo;

/**
 *
 * @author Administrador
 */
public class Auto {
    
    
    private String marca;
    private String color;
    private String precio;
    private String modelo;
    private String placa;

    public Auto() {
    }

    public Auto(String marca, String color, String precio, String modelo, String placa) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
    
}
