package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String comp = "";
		for(int i=0; i<letras.length-1; i++) {
			comp += letras[i]+", ";
		}
		comp += letras[letras.length-1];
		return comp;
	}
	
	public int cantidadLetras() {
		return this.getLetras().length;
	}

	public String[] getLetras() {return letras;}
	public void setLetras(String[] letras) {this.letras = letras;}

	public String getInterpretacion() {return interpretacion;}
	public void setInterpretacion(String interpretacion) {this.interpretacion = interpretacion;}
}
