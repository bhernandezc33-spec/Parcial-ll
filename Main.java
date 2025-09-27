
public class Main {
        public static void main(String[] args) {
            System.out.println("Bienvenido al mundo Pokemon");









            Squietle squietle = new Squietle() {
                @Override
                protected void actacarAranazo() {
                    super.actacarAranazo();
                }
            };
            Charizard charizard = new Charizard(){
                @Override
                protected void actacarAranazo() {
                    super.actacarAranazo();
                }
            };
            Ninorino ninorino = new Ninorino(){
                @Override
                protected void actacarAranazo() {
                    super.actacarAranazo();
                }
            };
            Pikachu pikachu = new Pikachu(){
                @Override
                protected void actacarAranazo() {
                    super.actacarAranazo();
                }
            };
            System.out.println(squietle);
            System.out.println(charizard);
            System.out.println(pikachu);
            System.out.println(ninorino);


        }
    }