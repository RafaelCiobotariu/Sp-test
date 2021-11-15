public class Melodie implements MediaObject{
    private int dimensiune;
    private String titlu;

    public Melodie(int dimensiune, String titlu) {
        this.dimensiune = dimensiune;
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return "Melodie{" +
                "dimensiune=" + dimensiune +
                ", titlu='" + titlu + '\'' +
                '}';
    }
}
