import java.util.HashMap;

public class HashMapGenre {
    public static void main(String[] args) {
        HashMap<String, Integer> genres = new HashMap<String, Integer>();

        genres.put("CRIME", 10);
        genres.put("THRILLER", 15);
        genres.put("ETC", 30);

        int total = 0;
        for( int i : genres.values()) {
            total += i;
        }

        System.out.println("Total number of books: " +total);
//        System.out.println(genres.values());
    }
}
