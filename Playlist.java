import java.util.ArrayList;
import java.util.List;

public class Playlist implements MediaObject{
    private int dimensiune;
    private String titlu;
    private int durata;
    private List<MediaObject> lista = new ArrayList<>();

    public Playlist(int dimensiune, String titlu) {
        this.dimensiune = dimensiune;
        this.titlu = titlu;
    }

    public void addElement(MediaObject o)
    {
        lista.add(o);
        if(o instanceof GIF)
            durata+=1;
        else if(o instanceof Videoclip)
            durata+=3;
        else if(o instanceof Melodie)
            durata+=5;
        else if(o instanceof Playlist)
            durata+=((Playlist) o).getDurata();
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "dimensiune=" + dimensiune +
                ", titlu='" + titlu + '\'' +
                ", lista=" + lista +
                '}';
    }

    public int durataMelodii()
    {
        int d=0;
        for(MediaObject o: lista)
        {
            if(o instanceof Melodie)
                d += 3;
            if(o instanceof Playlist)
                d += ((Playlist) o).durataMelodii();
        }
        return d;
    }

    public int durataGifs()
    {
        int d=0;
        for(MediaObject o: lista)
        {
            if(o instanceof GIF)
                d += 1;
            if(o instanceof Playlist)
                d += ((Playlist) o).durataGifs();
        }
        return d;
    }

    public int durataVideo()
    {
        int d=0;
        for(MediaObject o: lista)
        {
            if(o instanceof Videoclip)
                d += 1;
            if(o instanceof Playlist)
                d += ((Playlist) o).durataVideo();
        }
        return d;
    }
}
