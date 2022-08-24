package tema9;

public class Trabajador extends Persona{
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [salario=" + salario + ", Edad=" + getEdad() + ", Nombre=" + getNombre()
				+ ", Telefono=" + getTelefono() + "]";
	}
	
}
