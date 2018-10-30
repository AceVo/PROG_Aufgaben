public class Flugzeug {

    private double maxGewicht, leerGewicht, ladungGewicht, reiseGeschw, flugStunden, verbrauch, tankKapazitaet, kerosinVorrat;

    public static void main(String[] args) {
        Flugzeug albatros = new Flugzeug(70000, 35000, 10000, 800, 500, 2500, 25000, 8000);

        System.out.println("---Startzustand---");
        albatros.info();
        System.out.println("---1.500 kg laden und 3.000 km fliegen---");
        System.out.println(albatros.laden(1500));
        System.out.println(albatros.fliegen(3000));
        System.out.println("---10.000 l tanken und 3.000 km fliegen---");
        albatros.tanken(10000);
        System.out.println(albatros.getKerosinVorrat());
        System.out.println(albatros.fliegen(3000));
        System.out.println("---------------------");
    }

    public Flugzeug(double maxGewicht, double leerGewicht, double ladungGewicht, double reiseGeschw, double flugStunden,
                    double verbrauch, double tankKapazitaet, double kerosinVorrat){
        this.maxGewicht = maxGewicht;
        this.leerGewicht = leerGewicht;
        this.ladungGewicht = ladungGewicht;
        this.reiseGeschw = reiseGeschw;
        this.flugStunden = flugStunden;
        this.verbrauch = verbrauch;
        this.tankKapazitaet = tankKapazitaet;
        this.kerosinVorrat = kerosinVorrat > this.tankKapazitaet ? this.tankKapazitaet : kerosinVorrat ;
    }

    public double getMaxGewicht() {
        return maxGewicht;
    }

    public double getLeerGewicht() {
        return leerGewicht;
    }

    public double getLadungGewicht() {
        return ladungGewicht;
    }

    public double getReiseGeschw() {
        return reiseGeschw;
    }

    public double getFlugStunden() {
        return flugStunden;
    }

    public double getVerbrauch() {
        return verbrauch;
    }

    public double getTankKapazitaet() {
        return tankKapazitaet;
    }

    public double getKerosinVorrat() {
        return kerosinVorrat;
    }

    public double getGesamtGewicht() {
        return leerGewicht + ladungGewicht + kerosinVorrat * 0.8;
    }

    public double getReichweite() {
        return (kerosinVorrat / verbrauch) * reiseGeschw;
    }

    public boolean fliegen(double km) {
        if (getReichweite() > km && getGesamtGewicht() < maxGewicht && km > 0) {
            double flugZeit = km / reiseGeschw;
            kerosinVorrat = kerosinVorrat - flugZeit * verbrauch;
            flugStunden = flugStunden + flugZeit;
            return true;
        } else {
            return false;
        }
    }

    public void tanken(double liter) {

        if (liter >= 0) {
            kerosinVorrat = liter + kerosinVorrat > tankKapazitaet ? tankKapazitaet : liter + kerosinVorrat;
        } else {
            kerosinVorrat = kerosinVorrat - liter < 0 ? 0 : kerosinVorrat - liter;
        }
    }

    public boolean laden(double kg) {
        if (kg + ladungGewicht > maxGewicht) {
            return false;
        } else {
            ladungGewicht = ladungGewicht + kg < 0 ? 0 : ladungGewicht + kg;
            return true;
        }
    }

    public void info() {
        System.out.println("Flugstundenzähler: " + flugStunden + "\n" + "Tankinhalt: " + kerosinVorrat + "\n" + "Gesamtgewicht: " + getGesamtGewicht());
    }
}
