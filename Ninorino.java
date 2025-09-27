public abstract class Ninorino extends JuegoPokemon implements Tierra {

    public Ninorino(){

    }

    @Override
    protected void actacarPlaje() {
        System.out.println("HOLA SOY Ninorino Y ESTE ES MI ATACAQUE PLACAJE");}
    @Override
    protected  void actacarAranazo(){
        System.out.println("HOLA SOY Ninorino Y ESTE ES MI ACATAQUE ARANAZO");};
    @Override
    protected void actacarMordisco(){
        System.out.println("HOLA SOY Ninorino Y ESTE ES MI ACATQUE MORDISCO");}
    @Override
    public void atacarTerremoto(){
        System.out.println("HOLA SOY Ninorino Y ESTE ES MI ACATQUE Terremoto");
    }
    @Override
    public void atacarFisura(){
        System.out.println("HOLA SOY Ninorino Y ESTE ES MI ACATQUE Fisura");
    }
    @Override
    public void atacarTierraViva(){
        System.out.println("HOLA SOY Ninorino Y ESTE ES MI ACATQUE Tierra Viva");
    }

}
