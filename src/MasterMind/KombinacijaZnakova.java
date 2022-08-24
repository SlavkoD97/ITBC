package MasterMind;

import java.util.*;

public class KombinacijaZnakova {

    private int velicina;
    private ArrayList<String> kombinacija;



    // Конструктор који прима величину

    public KombinacijaZnakova(int velicina)
    {
        this.velicina = velicina;
        kombinacija = new ArrayList<>();
    }

    // void setter за комбинацију

    public void setKombinacija() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Trazene znakove unesite u formatu:\n" + "X ".repeat(velicina));
        kombinacija.clear();

        for (int i = 0; i < velicina; i++) {
            var znak = sc.next();
            if(Znakovi.dozvoljeniZnakovi.contains(znak)){
                kombinacija.add(znak);
            }
            else {
                System.out.println("Dozvoljeni znakovi su: " + Znakovi.dozvoljeniZnakovi);
                sc.nextLine();
                setKombinacija();
                return;
            }

            }


        }

    public ArrayList<String> getKombinacija() {
        return kombinacija;
    }

    // void setRandom за комбинацију

    public void setRandom() {

        kombinacija.clear();
        for (int i = 0; i < velicina; i++) {

            var index = (int) (Math.random() * Znakovi.dozvoljeniZnakovi.size());
            kombinacija.add(Znakovi.dozvoljeniZnakovi.get(index));
        }



    }


    // boolean equals - Override

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KombinacijaZnakova that = (KombinacijaZnakova) o;
        return velicina == that.velicina && kombinacija.equals(that.kombinacija);
    }

    @Override
    public int hashCode() {
        return Objects.hash(velicina, kombinacija);
    }


    // void porediKombinacije(MasterMind.KombinacijaZnakova kz)
    public void porediKombinacije(KombinacijaZnakova kz) {

        int brojTacnih = 0;
        int brojPogresnih = 0;
        ArrayList<String> tempTrazena = new ArrayList<>();

        for (int i = 0; i < this.kombinacija.size(); i++) {
            tempTrazena.add(i, this.kombinacija.get(i));
        }
            for (int i = 0; i < this.kombinacija.size(); i++) {
                if (this.kombinacija.get(i).equals(kz.kombinacija.get(i))) {
                    brojTacnih++;
                   tempTrazena.set(i, "*");

                }
            }
            for (int i = 0; i < kz.kombinacija.size(); i++){
                if (tempTrazena.contains(kz.kombinacija.get(i))){
                    brojPogresnih++;
                    for (int j = 0; j < this.kombinacija.size(); j++){
                        if (tempTrazena.get(j).equals(kz.kombinacija.get(i))){
                            tempTrazena.set(j, "*");
                            break;

                        }
                    }
                }

            }


        System.out.println("@ ".repeat(brojTacnih) + "# ".repeat(brojPogresnih));






    }
}





