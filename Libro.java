/**
 * 
 */
package ejercicio3;

public class Libro {

	private int ISBN;
	private String titulo;
	private String autor;
	private int numeroPaginas;

	/**
	 * @param iSBN
	 * @param titulo
	 * @param autor
	 * @param numeroPaginas
	 */
	public Libro() {
		ISBN = 0000000;
		this.titulo = "";
		this.autor = "";
		this.numeroPaginas = 0;
	}

	/**
	 * @param iSBN
	 * @param titulo
	 * @param autor
	 * @param numeroPaginas
	 */
	public Libro(int iSBN, String titulo, String autor, int numeroPaginas) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * @return the iSBN
	 */
	public int getISBN() {
		return ISBN;
	}

	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the numeroPaginas
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * @param numeroPaginas the numeroPaginas to set
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "El libro con ISBN " + ISBN + ", creado por el autor " + autor + ", tiene " + numeroPaginas + " paginas";
	}

	public int compareTo(Libro a) {

		if (this.numeroPaginas > a.numeroPaginas) {
			return 1;
		} else if (this.numeroPaginas < a.numeroPaginas) {
			return -1;
		} else {
			return 0;
		}
	}
}
