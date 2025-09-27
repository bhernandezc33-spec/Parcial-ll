public abstract class Pikachu extends JuegoPokemon implements Electrico{

    public Pikachu(){

    }

    @Override
    protected void actacarPlaje() {
        System.out.println("HOLA SOY Pikachu Y ESTE ES MI ATACAQUE PLACAJE");}
    @Override
    protected  void actacarAranazo(){
        System.out.println("HOLA SOY Pikachu Y ESTE ES MI ACATAQUE ARANAZO");};
    @Override
    protected void actacarMordisco(){
        System.out.println("HOLA SOY Pikachu Y ESTE ES MI ACATQUE MORDISCO");}
    @Override
    public void atacarImpertrueno (){
        System.out.println("HOLA SOY Pikachu Y ESTE ES MI ACATQUE ES IMPERTRUENO");
    }
    @Override
    public void atacarPunoTreuno(){
        System.out.println("HOLA SOY Pikachu Y ESTE ES MI ACATQUE ES PUNO TREUNO");
    }

}

