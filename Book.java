public class Book {
    String title;
    String author;
    double price;
    int rating;
    

    //constructor
    Book(String t, String a, double p){
        title = t;
        author = a;
        price = p;

    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
 

    public void setRating(int rat){
        this.rating=rat;
    }

    public int getRating(){
        return rating;
    }

}
