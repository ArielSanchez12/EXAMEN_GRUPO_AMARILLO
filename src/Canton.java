public class Canton extends Ciudad{
    private String nombreCan;
    private String tipo;
    private int num_parroquias;

    public Canton(String nombrePais, int poblacion, double territorio, String nombreProv, double porcentaje_abarca, String cod_provincia, String nombreC, String region, String es_capital, String nombreCan, String tipo, int num_parroquias) {
        super(nombrePais, poblacion, territorio, nombreProv, porcentaje_abarca, cod_provincia, nombreC, region, es_capital);
        this.nombreCan = nombreCan;
        this.tipo = tipo;
        this.num_parroquias = num_parroquias;
    }


    public String getNombreCan() {
        return nombreCan;
    }

    public void setNombreCan(String nombreCan) {
        this.nombreCan = nombreCan;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNum_parroquias() {
        return num_parroquias;
    }

    public void setNum_parroquias(int num_parroquias) {
        this.num_parroquias = num_parroquias;
    }

    @Override
    public void Informacion() {
        super.Informacion();
        System.out.println("Nombre: " + getNombreCan());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Numero de parroquias: " + getNum_parroquias());
    }

    public void lugaresTuristicos(){
        System.out.println("No lugares turisticos :(");
    }
}
