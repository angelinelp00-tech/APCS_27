package pkg;
public class Movie{
    private String movieName;
    private double rating;
    private int numRating;
    private int revenue;

    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRating = 33;
        revenue = 623357910;
    }
    public Movie(String a, double b, int c, int d){
        movieName = a;
        rating = b;
        numRating = c;
        revenue = d;
    }

    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRating);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
        return;
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double x){
        rating = ((numRating * rating) + x)/(numRating + 1);
        numRating++;
        return;
    }
    public int getRating(){
        return rating;
    }
    public boolean compareRatings(String x){
        boolean bigger;
        double rating2 = mA.getRating();
        if(rating2 > x){
            bigger = true;
        }
        else{
            bigger = false;
        }
        return bigger;
    }

}