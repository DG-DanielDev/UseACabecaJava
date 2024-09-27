package chapter4.codes.song;

class Song {
  String title;
  String artist;

  void setTitle(String t) {
    title = t;
  }
  void setArtist(String a) {
    artist = a;
  }
  void play() {
//    soundPlayer.playSound(title);
    System.out.println("Playing: " + title + "...");
  }
}
