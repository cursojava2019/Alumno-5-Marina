package es.indra.ejercicio4;

public class Lavadora extends Electrodomestico {

	protected Float carga;
	static final Float CARGA_DEFECTO = new Float(0);

	public Lavadora() {
		super();
		this.carga = CARGA_DEFECTO;
	}

	public Lavadora(Float precioBase, Float peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEFECTO;
	}

	public Lavadora(Float precioBase, String color, Character clasificacion, Float peso, Float carga) {
		super(precioBase, color, clasificacion, peso);
		this.carga = carga;
	}

	public Float getCarga() {
		return carga;
	}

	public void setCarga(Float carga) {
		this.carga = carga;
	}

	@Override
	public Float precioFinal() {
		Float precioFinal = super.precioFinal();
		if (carga > 30)
			precioFinal += 50;
		return precioFinal;
	}

}
