package classes;

public class Triangulo {
	private Integer lado1;
	private Integer lado2;
	private Integer lado3;
	public Triangulo(Integer lado1, Integer lado2, Integer lado3) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	
	public Integer getLado1() {
		return lado1;
	}


	public void setLado1(Integer lado1) {
		this.lado1 = lado1;
	}


	public Integer getLado2() {
		return lado2;
	}


	public void setLado2(Integer lado2) {
		this.lado2 = lado2;
	}


	public Integer getLado3() {
		return lado3;
	}


	public void setLado3(Integer lado3) {
		this.lado3 = lado3;
	}


	public String tipo_triangulo(Triangulo triangulo) {
		String resultado;
		
		if (this.lado1 < 0 || this.lado2 < 0 || this.lado3 < 0){
			resultado = "Não é triangulo. Lado negativo";
		}
		else if(this.lado1 == 0 && this.lado2 == 0 && this.lado3 == 0) {
			resultado = "Não é triangulo. Tres lados zero";
		} 
		else if(this.lado1 == 0 || this.lado2 == 0 || this.lado3 == 0) {
			resultado = "Não é triangulo. Lado zero";
		} 
		else if (((this.lado1 + this.lado2) == this.lado3) || ((this.lado1 + this.lado3) == this.lado2)  || ((this.lado2 + this.lado3) == this.lado1)) {
			resultado = "Não é triangulo. Soma de dois lados igual terceiro lado";
		}
		else if (((this.lado1 + this.lado2) < this.lado3) || ((this.lado1 + this.lado3) < this.lado2)  || ((this.lado2 + this.lado3) < this.lado1)) {
			resultado = "Não é triangulo. Soma de dois lados menor que o terceiro lado";
		}
		else if (((this.lado1 + this.lado2) > this.lado3) && ((this.lado1 + this.lado3) > this.lado2)  && ((this.lado2 + this.lado3) > this.lado1)) {
		if(this.lado1 == this.lado2 && this.lado2 == this.lado3 && this.lado1 == this.lado3) {
			resultado = "Equilatero";
		}
		else if ((this.lado1 == this.lado2 && this.lado1 != this.lado3) || (this.lado2 == this.lado3 && this.lado3 != this.lado1) || (this.lado1 == this.lado3 && this.lado3 != this.lado2)) {
			resultado = "Isoceles";
		}
		else {
			resultado = "Escaleno";
		}
		return resultado;
	}
		
		else {
			resultado = "Não é triangulo";
		}
		return resultado;
	}
	
}
