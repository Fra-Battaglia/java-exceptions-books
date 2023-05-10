package org.lessons.java.books;

public class Libro {
	private String titolo;
	private int pagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int pagine, String autore, String editore) throws Exception {
		setTitolo(titolo);
		setPagine(pagine);
		setAutore(autore);
		setEditore(editore);
	}
	
	// Titolo
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) throws Exception {
		if(titolo.length() == 0) throw new Exception("Inserisci l'autore");
		this.titolo = titolo;
	}
	
	// Pagine
	public int getPagine() {
		return pagine;
	}
	
	public void setPagine(int pagine) throws Exception {
		if (pagine <= 0) {
			throw new Exception("Un libro con 0 pagine non è un libro, riprova");
		}
		
		this.pagine = pagine;
	}
	
	// Autore
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) throws Exception {
		if (autore.length() == 0) {
			throw new Exception("Inserisci l'autore");
		}
		this.autore = autore;
	}
	
	// Editore
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	protected String getLibroString() {
		return 
			"Titolo: " + getTitolo() + "\n" +
			"Numero pagine: " + getPagine() + "\n" + 
			"Autore: " + getAutore() + "\n" +
			"Editore: " + getEditore();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Libro \n" + getLibroString();
	}
}
