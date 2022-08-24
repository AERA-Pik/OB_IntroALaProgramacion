package tema9;

public class Cliente extends Persona{
	private double credito;

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}	

	@Override
	public String toString() {
		return "Cliente [credito=" + credito + ", Edad=" + getEdad() + ", Nombre=" + getNombre()
				+ ", Telefono=" + getTelefono() + "]";
	}
	
	
	
	
	
	

}
