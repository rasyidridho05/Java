package Movie;

public class Main {

    public static void main(String[] args) {
        SfMovie[] movies = {new SfMovie("Avatar", "James Cameron"), new SfMovie("AI", "Steven Spielberg")};
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }
    }
}
