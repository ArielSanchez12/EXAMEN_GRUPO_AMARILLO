public class Main {
    public static void main(String[] args) {

        Pais pais = new Pais();
        pais.setNombrePais("Ecuador");
        pais.setPoblacion(17900000);
        pais.setTerritorio(283.561);

        Provincia provincia = new Provincia(pais.getNombrePais(), pais.getPoblacion(), pais.getTerritorio(), "NombreProv", 000.2, "cod_provincia");
        provincia.setNombreProv("Pichincha"); //Aca seteamos los valores a nuestro gusto
        provincia.setPorcentaje_abarca(43.704);
        provincia.setCod_provincia("17");

        Ciudad ciudad = new Ciudad(pais.getNombrePais(), pais.getPoblacion(), pais.getTerritorio(), provincia.getNombreProv(), provincia.getPorcentaje_abarca(), provincia.getCod_provincia(), "nombreC", "region", "es_capital");
        ciudad.setNombreC("Quito");
        ciudad.setRegion("Sierra");//Aca seteamos los valores a nuestro gusto
        ciudad.setEs_capital("Si");

        Canton canton = new Canton(pais.getNombrePais(), pais.getPoblacion(), pais.getTerritorio(), provincia.getNombreProv(), provincia.getPorcentaje_abarca(), provincia.getCod_provincia(), ciudad.getNombreC(), ciudad.getRegion(), ciudad.getEs_capital(), "nombreCan", "tipo", 0);
        canton.setNombreCan("Cayambe");
        canton.setTipo("Urbano");//Aca seteamos los valores a nuestro gusto
        canton.setNum_parroquias(8);

        pais.Informacion();
        pais.Belico();
        System.out.println("\n");
        provincia.Informacion();
        provincia.mostrarRepresentante();
        System.out.println("\n");
        ciudad.Informacion();
        ciudad.mostrarAlcalde();
        System.out.println("\n");
        canton.Informacion();
        canton.lugaresTuristicos();

    }
}