public class Videoclip implements MediaObject{
    private int dimensiune;
    private String titlu;

    public Videoclip(int dimensiune, String titlu) {
        this.dimensiune = dimensiune;
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return "Videoclip{" +
                "dimensiune=" + dimensiune +
                ", titlu='" + titlu + '\'' +
                '}';
    }


}
