public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book() {
    }
    public Book(String title, String author,String description,double price,boolean isInStock){

        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;

    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String displayText(){
        //System.out.println("This prints out the author: " + getAuthor());

        //System.out.println("This prints out the title:" + getTitle());

        //System.out.println("This prints out the description:" + getDescription());
        String displayText = "";
        displayText = "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nDescription: " +getDescription();

        return displayText;

    }

    public double displayCost(int number){
        double total = 0;
        if(isInStock()){
            total = getPrice() * number;
        }
        return total;
    }




    }


