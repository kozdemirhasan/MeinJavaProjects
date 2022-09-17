package aufgaben.coding.aufgabe024;

 class Book {
	public static int maxBookZahl;
	public int counter=0;

	public Book(int maxBookZahl) {
		this.maxBookZahl = maxBookZahl;

	}
	
	public  Book meinMethod() {
		this.counter++;
		
		if(this.counter <=this.maxBookZahl) {
			Book book  = new Book();
			
		}
		

	return null	;
	}

}
