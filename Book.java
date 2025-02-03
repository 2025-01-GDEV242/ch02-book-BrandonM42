/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookCourseText;
    }

    // Add the methods here ...
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void setRefNumber(String ref)
    {
        if(ref.length() >=3)
        {
           refNumber = ref; 
        }
        else
        System.out.println("Error give a number greater than or equal to 3");
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void borrow()
    {
        borrowed +=1;
    }
    
    public void printDetails()
    {
        if(getRefNumber().length() > 0)
        {
            System.out.println("Book author: "+getAuthor()+" Book title: "+getTitle()+" Book pages: "+getPages()+" Reference Num: "+getRefNumber()+" Number of times borrowed: "+getBorrowed()+"");
        }
        else 
        System.out.println("Book author: "+getAuthor()+" Book title: "+getTitle()+" Book pages: "+getPages()+" Reference Num: ZZZ"+" Number of times borrowed: "+getBorrowed()+"");
    }
    
    
    
    
    
    
}
