public class GIF implements MediaObject{
    private int dimensiune;
    private String titlu;

    public GIF(int dimensiune, String titlu) {
        this.dimensiune = dimensiune;
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return "GIF{" +
                "dimensiune=" + dimensiune +
                ", titlu='" + titlu + '\'' +
                '}';
    }
}
