import java.util.Scanner;
import java.text.DecimalFormat;

public class MusicList {
    public static void main(String[] args){
        
        // Generates new scanner for user input
        Scanner scanA = new Scanner(System.in);

        // Prompts input for album track 1
        System.out.print("Enter album: ");
        String album = scanA.nextLine();

        // Prompts input for artist track 1
        System.out.print("Enter artist: ");
        String artist = scanA.nextLine();

        // Prompts input for title track 1
        System.out.print("Enter title: ");
        String title = scanA.nextLine();

        // Prompts input for length of the song, in minutes and seconds format track 1
        System.out.print("Enter play time (mm:ss): ");
        String play = scanA.nextLine();

        // Converts song length to total seconds track 1
        int index = play.indexOf(':');
        int playTime = 60 * Integer.parseInt(play.substring(0, index)) + Integer.parseInt(play.substring(index + 1));

        Track track1 = new Track(title, artist, album, playTime);

        // Prompts input for album track 2
        System.out.print("Enter album: ");
        album = scanA.nextLine();

        // Prompts input for artist track 2
        System.out.print("Enter artist: ");
        artist = scanA.nextLine();

        // Prompts input for title track 2
        System.out.print("Enter title: ");
        title = scanA.nextLine();

        // Prompts input for length of the song, in minutes and seconds format track 2
        System.out.print("Enter play time (mm:ss): ");
        play = scanA.nextLine();

        // Converts song length to total seconds track 2
        index = play.indexOf(':');
        playTime = 60 * Integer.parseInt(play.substring(0, index)) + Integer.parseInt(play.substring(index + 1));

        Track track2 = new Track(title, artist, album, playTime);

        // Prompts input for album track 3
        System.out.print("Enter album: ");
        album = scanA.nextLine();

        // Prompts input for artist track 3
        System.out.print("Enter artist: ");
        artist = scanA.nextLine();

        // Prompts input for title track 3
        System.out.print("Enter title: ");
        title = scanA.nextLine();

        // Prompts input for length of the song, in minutes and seconds format track 3
        System.out.print("Enter play time (mm:ss): ");
        play = scanA.nextLine();

        // Converts song length to total seconds track 3
        index = play.indexOf(':');
        playTime = 60 * Integer.parseInt(play.substring(0, index)) + Integer.parseInt(play.substring(index + 1));

        Track track3 = new Track(title, artist, album, playTime);
    
        // Computes average play time of the tracks and formats an average time
        double totalPlay = (track1.getPlayTime() + track2.getPlayTime() + track3.getPlayTime());
        double avgPlay = totalPlay / 3;
        DecimalFormat avgPlayDF = new DecimalFormat("#.00");
    
        System.out.println("\nAverage play time: " + avgPlayDF.format(avgPlay));

        // Determines which track is closest to 180 seconds
        if (track1.getPlayTime() % 180 >= 0) {
            System.out.println("Track with  play time closest to 180 secs is: " + track1.getTitle());
        }
        else if(track2.getPlayTime().compareTo(track1.getPlayTime())){
            System.out.println("Track with play time closest to 180 secs is: " + track2.getTitle());
        }
        
        // Prints Template
        String design = ("============================================");
        String format = design + design + ("\nTitle\t\t\t       Artist\t\t    Album\t\t\t    Time\n") + design + design;
        
        //Determines and prints tracks in order of play time
        System.out.println(format);

        if (track1.getPlayTime() >= track2.getPlayTime() && track2.getPlayTime() >= track3.getPlayTime()){
            System.out.print(track1 + "\n" + track2 + "\n" + track3 + "\n");
        }
        else if (track1.getPlayTime() >= track3.getPlayTime() && track3.getPlayTime() >= track2.getPlayTime()){
            System.out.print(track1 + "\n" + track3 + "\n" + track2 + "\n");
        }
        else if (track2.getPlayTime() >= track1.getPlayTime() && track1.getPlayTime() >= track3.getPlayTime()){
            System.out.print(track2 + "\n" + track1 + "\n" + track3 + "\n");
        }
        else if (track2.getPlayTime() >= track3.getPlayTime() && track3.getPlayTime() >= track1.getPlayTime()){
            System.out.print(track2 + "\n" + track3 + "\n" + track1 + "\n");
        }
        else if (track3.getPlayTime() >= track2.getPlayTime() && track2.getPlayTime() >= track1.getPlayTime()){
            System.out.print(track3 + "\n" + track2 + "\n" + track1 + "\n");
        }
        else if (track3.getPlayTime() >= track1.getPlayTime() && track1.getPlayTime() >= track2.getPlayTime()){
            System.out.print(track3 + "\n" + track1 + "\n" + track2 + "\n");
        }

        // Prints out the rest of the template
        System.out.println(design + design);

        scanA.close();
    }
}