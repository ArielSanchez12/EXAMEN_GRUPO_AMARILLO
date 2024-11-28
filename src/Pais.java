public class Pais {
    private String nombrePais;
    private int poblacion;
    private double territorio;

    public Pais(String nombrePais, int poblacion, double territorio){
        this.nombrePais = nombrePais;
        this.poblacion = poblacion;
        this.territorio = territorio;
    }
    public Pais(){

    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getTerritorio() {
        return territorio;
    }

    public void setTerritorio(double territorio) {
        this.territorio = territorio;
    }

    public void Informacion(){
        System.out.println("Nombre del Pais: " + nombrePais);
        System.out.println("Poblacion: " + poblacion + " de habitantes");
        System.out.println("Territorio: " + territorio + " km²");
    }

    public void Belico() {
        if (nombrePais == "Ecuador") {
            System.out.println("No esta en guerra");
        }else {
            System.out.println("Si esta en guerra");
        }
    }

}
