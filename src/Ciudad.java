public class Ciudad extends Provincia {
    private String nombreC;
    private String region;
    private String es_capital;

    public Ciudad(String nombrePais, int poblacion, double territorio, String nombreProv, double porcentaje_abarca, String cod_provincia, String nombreC, String region, String es_capital) {
        super(nombrePais, poblacion, territorio, nombreProv, porcentaje_abarca, cod_provincia);
        this.nombreC = nombreC;
        this.region = region;
        this.es_capital = es_capital;
    }


    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEs_capital() {
        return es_capital;
    }

    public void setEs_capital(String es_capital) {
        this.es_capital = es_capital;
    }

    @Override
    public void Informacion() {
        super.Informacion();
        System.out.println("Información Ciudad: " + getNombreC());
        System.out.println("Región: " + getRegion());
        System.out.println("Es capital: " + getEs_capital());
    }

    public void mostrarAlcalde(){
        String nombreAlc = "Pabel Muñoz";
        System.out.println("Representante de la provincia: " + nombreAlc);
    }
}
