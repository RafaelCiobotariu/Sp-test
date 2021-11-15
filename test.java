public class test {
    public static void main(String[] args) {

        Melodie m1= new Melodie(23,"Manea");
        Melodie m2= new Melodie(34, "Blank Space");
        GIF g1 = new GIF(2,"Pisicute");

        Melodie m3= new Melodie(5,"Little bit of love");
        Videoclip v1 = new Videoclip(10,"Top 10 wwe moments");

        Playlist p1 = new Playlist(345,"MyPlaylist");
        Playlist p2 = new Playlist(30,"FamilyPlaylist");


        p1.addElement(m1);
        p1.addElement(m2);
        p1.addElement(g1);

        p2.addElement(m3);
        p2.addElement(v1);
        p2.addElement(p1);

        System.out.println(p2);
        System.out.println(p2.durataMelodii());
        System.out.println(p1.getDurata());
        System.out.println(p2.getDurata());

    }
}
