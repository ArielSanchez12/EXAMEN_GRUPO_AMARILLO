public class Provincia extends Pais{
    private String nombreProv;
    private double porcentaje_abarca;
    private  String cod_provincia;

    public Provincia(String nombrePais, int poblacion, double territorio, String nombreProv, double porcentaje_abarca, String cod_provincia){
        super(nombrePais, poblacion, territorio);
        this.nombreProv = nombreProv;
        this.porcentaje_abarca = porcentaje_abarca;
        this.cod_provincia = cod_provincia;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public double getPorcentaje_abarca() {
        return porcentaje_abarca;
    }

    public void setPorcentaje_abarca(double porcentaje_abarca) {
        this.porcentaje_abarca = porcentaje_abarca;
    }

    public String getCod_provincia() {
        return cod_provincia;
    }

    public void setCod_provincia(String cod_provincia) {
        this.cod_provincia = cod_provincia;
    }

    @Override
    public void Informacion() {
        super.Informacion();
        System.out.println("Nombre de la provincia: " + nombreProv);
        System.out.println("Porcentaje de abarcación: " + porcentaje_abarca);
        System.out.println("Codigo de la provincia: " + cod_provincia);
    }

    public void mostrarRepresentante(){
        System.out.println("Representante de la provincia: " + super.getNombrePais());
    }
}
