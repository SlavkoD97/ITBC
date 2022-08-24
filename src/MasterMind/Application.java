package MasterMind;

public class Application {

    public static void main(String[] args) {

        var igra = new Skocko(); // ...

        System.out.println("Dobrodosli u MasterMind.by Slavko");


        System.out.println("Unesite kombinaciju i zapocnite igru.");

        igra.trazenaKombinacija.setRandom();


        while (!igra.jeGotova()) {
            igra.pokusaj();


        }
    }
}

