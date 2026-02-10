public class datos {
    private String Marca, tipo;
    private int Cilindraje, numCelda;
    private double pagoAn, paoAC;
    public datos(String marca, String tipo, int cilindraje, int numCelda, double pagoAn, double paoAC) {
        Marca = marca;
        this.tipo = tipo;
        Cilindraje = cilindraje;
        this.numCelda = numCelda;
        this.pagoAn = pagoAn;
        this.paoAC = paoAC;
    }
    public datos() {
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCilindraje() {
        return Cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }
    public int getNumCelda() {
        return numCelda;
    }
    public void setNumCelda(int numCelda) {
        this.numCelda = numCelda;
    }
    public double getPagoAn() {
        return pagoAn;
    }
    public void setPagoAn(double pagoAn) {
        this.pagoAn = pagoAn;
    }
    public double getPaoAC() {
        return paoAC;
    }
    public void setPaoAC(double paoAC) {
        this.paoAC = paoAC;
    }

    
}
