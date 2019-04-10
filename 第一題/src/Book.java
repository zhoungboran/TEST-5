public class Book {
    private String name,isbn,categary,publisher,totalPages;
    private int price;

    public Book(){
        System.out.println("123");
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return this.name;
    }
}
