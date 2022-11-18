import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
  
  //creo la playlist
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

  //aggiungo canzoni alla playlist
    desertIslandPlaylist.add("Enjoy the silence - Depeche Mode");
    desertIslandPlaylist.add("Warrior - Aurora");
    desertIslandPlaylist.add("A moment apart - Odesza");
    desertIslandPlaylist.add("Shake the disease - Depeche Mode");
    desertIslandPlaylist.add("Single Ladies - Beyonce");

    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

  //scambio posizione alle canzoni
    int indexA = desertIslandPlaylist.indexOf("Enjoy the silence - Depeche Mode");
    int indexB = desertIslandPlaylist.indexOf("Warrior - Aurora");

    String tempA = "Enjoy the silence - Depeche Mode";

    desertIslandPlaylist.set(indexA, "Warrior - Aurora");
    desertIslandPlaylist.set(indexB, tempA);

    System.out.println(desertIslandPlaylist);
  }
  
}
