public abstract class Squietle extends JuegoPokemon implements AGUA {

   public Squietle(){

   }

    @Override
    protected void actacarPlaje() {
         System.out.println("Hola soy Squietle y este es mi ataque Plaje ");
    }
    @Override
    protected  void actacarAranazo(){
        System.out.println("HOLA SOY Squietle Y ESTE ES MI ACATAQUE ARANAZO");};
    @Override
    protected void actacarMordisco(){
        System.out.println("HOLA SOY Squietle Y ESTE ES MI ACATQUE MORDISCO");}
    @Override
    public void atacarHidrobomba(){
        System.out.println("HOLA SOY Squietle Y ESTE ES MI ACATQUE HIDROMOBA");
    }
    @Override
    public void atacarPistolaAgua(){
        System.out.println("HOLA SOY Squietle Y ESTE ES MI ACATQUE Pistola Agua");
    }
    @Override
    public void atacarBurbuja(){
        System.out.println("HOLA SOY Squietle Y ESTE ES MI ACATQUE Burbuja");
    }

}

