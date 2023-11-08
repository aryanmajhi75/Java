import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Song {
    private String title;
    private String artist;
    private int durationInSeconds;
    private String genre;
    private int releaseYear;
    protected String album;
    public boolean isFavorite;

    public Song() {
        title = "Untitled";
        artist = "Unknown";
        durationInSeconds = 0;
        genre = "Other";
        releaseYear = 2000;
        album = "Unknown Album";
        isFavorite = false;
    }

    public Song(String title, String artist, int durationInSeconds, String genre, int releaseYear, String album, boolean isFavorite) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.album = album;
        this.isFavorite = isFavorite;
    }

    public void play() {
        System.out.println("Playing the song: " + title);
    }

    public void play(int volume) {
        System.out.println("Playing the song: " + title + " at volume " + volume);
    }

    public String getTitle() {
        return title;
    }
}

class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void play() {
        System.out.println("Playing the playlist: " + name);
        for (Song song : songs) {
            song.play();
        }
    }

    public String getSongsName() {
        return name;
    }

    public List<Song> getPlaylistTitle(){
        return songs; 
    }

    public int getSongSize(){
        return songs.size();
    }
}

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Song> songs = new ArrayList<>();
        List<Playlist> playlists = new ArrayList<>();

        while (true) {
            System.out.println("Song Management Menu:");
            System.out.println("1. Add a new song");
            System.out.println("2. Create a playlist");
            System.out.println("3. List all songs");
            System.out.println("4. List all playlists");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter song details:");
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Artist: ");
                    String artist = scanner.nextLine();
                    System.out.print("Duration (in seconds): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Release Year: ");
                    int releaseYear = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Album: ");
                    String album = scanner.nextLine();
                    System.out.print("Is it a favorite? (true/false): ");
                    boolean isFavorite = scanner.nextBoolean();

                    Song newSong = new Song(title, artist, duration, genre, releaseYear, album, isFavorite);
                    songs.add(newSong);
                    System.out.println("Song added successfully!");
                    break;

                case 2:
                    System.out.println("Enter playlist name:");
                    String playlistName = scanner.next();
                    scanner.nextLine(); 
                    Playlist playlist = new Playlist(playlistName);

                    System.out.println("Select songs to add to the playlist (by index):");
                    for (int i = 0; i < songs.size(); i++) {
                        System.out.println(i + ". " + songs.get(i).getTitle());
                    }
                    String songIndexes = scanner.nextLine();
                    String[] indexes = songIndexes.split(" ");
                    for (String index : indexes) {
                        int songIndex = Integer.parseInt(index);
                        if (songIndex >= 0 && songIndex < songs.size()) {
                            playlist.addSong(songs.get(songIndex));
                        }
                    }
                    playlists.add(playlist);
                    System.out.println("Playlist created successfully!");
                    break;

                case 3:
                    System.out.println("List of Songs:");
                    for (int i = 0; i < songs.size(); i++) {
                        System.out.println((i + 1) + ". " + songs.get(i).getTitle());
                    }
                    break;

                case 4:
                    System.out.println("List of Playlists:");
                    for (int i = 0; i < playlists.size(); i++) {
			System.out.println("PlayList Name : " + playlists.get(i).getPlaylistTitle());
			for(int j=0;j< playlists.get(i).getSongSize(); j++){
				System.out.println((j + 1) + ". " + playlists.get(j).getSongsName());
			}
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
