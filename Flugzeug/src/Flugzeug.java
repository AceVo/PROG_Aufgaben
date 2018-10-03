public class Flugzeug {

    private double maxGewicht, leerGewicht, ladungGewicht, reiseGeschw, flugStunden, verbrauch, tankKapazitaet, kerosinVorrat;

    public static void main(String[] args) {
        Flugzeug albatros = new Flugzeug(70000, 35000, 10000, 800, 500,2500,25000,8000);

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
        return this.maxGewicht;
    }

    public double getLeerGewicht() {
        return this.leerGewicht;
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
        return 0.0;
    }
    public String toString(){
        String string = "Ich bin ein tolles Flugzeug. Ich bin " +
                this.leerGewicht +
                "kg schwer ist und wenn ich beladen bin, wiege ich sogar "
                + this.ladungGewicht + "kg!";
        return string;
    }

}