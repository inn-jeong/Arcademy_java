package Chapter04;

public class Song {
	String title = "";
	String artist = "";
	int year = 0;
	String country = "";
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public Song() {}
	void show() {
		System.out.printf("%d년 %s국적의 %s가 부른 %s",year,country,artist,title);
	}
	public static void main(String[] args) {
		Song song = new Song("Danding Queen", "ABBA", 1978, "스웨덴");
		song.show();
	}
}
