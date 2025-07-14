package week2.monday.assignments;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library lib=new Library();
System.out.println(lib.addBook("HarryPotter"));
lib.issueBook();
	}

	
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
}
