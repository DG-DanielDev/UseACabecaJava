package chapter4.codes.song;

public class SongTestDrive{
  public static void main(String[] args) {
    Song t2 = new Song();
    t2.setArtist("Travis");
    t2.setTitle("Sing");

    Song s3 = new Song();
    s3.setArtist("Sex Pistols");
    s3.setTitle("My way");

    System.out.println();
    System.out.print(s3.title + " by ");
    System.out.println(s3.artist);
    System.out.println("============");
    System.out.print(t2.title + " by ");
    System.out.println(t2.artist);
    System.out.println();

    s3.play();
  }
}
