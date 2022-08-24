package MasterMind;

public class Skocko {

    private int maxBrPokusaja = 7;
    private int brPokusaja;




        KombinacijaZnakova trazenaKombinacija = new KombinacijaZnakova(4);
        KombinacijaZnakova trenutnaKombinacija = new KombinacijaZnakova(4);



    // Конструктор
    public void pokusaj(){


        trenutnaKombinacija.setKombinacija();


        System.out.println(trenutnaKombinacija.getKombinacija());


        trazenaKombinacija.porediKombinacije(trenutnaKombinacija);

        brPokusaja++;

        System.out.println("Broj pokusaja: " + brPokusaja + "\n Dozvoljen broj pokusaja: " + maxBrPokusaja);



    }

    public boolean jeGotova(){


        if (brPokusaja > maxBrPokusaja){
            System.out.println("Niste uspeli, trazena kombinacija je bila: \n"
                    + trazenaKombinacija.getKombinacija());
        return true;}
        if (trazenaKombinacija.equals(trenutnaKombinacija)){
            System.out.println("Cestitamo.Pronasli ste kombinaciju");
        return true;}

        else return false;
    }




        }

    // boolean isGameOver()






