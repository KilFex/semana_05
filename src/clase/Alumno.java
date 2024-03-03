package clase;

public class Alumno {
	
	//  Atributos privados
	private int codigo, nota1, nota2, nota3, nota4;
	private String nombre, apellidoPaterno, apellidoMaterno;	
	//  Constructor
    public Alumno(int codigo, String nombre,String apellidoPaterno, String apellidoMaterno, int nota1, int nota2,int nota3,int nota4) {
    	this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
	//  Métodos de acceso: set/get
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setapellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public void setapellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	public void setNota4(int nota4) {
		this.nota4 = nota4;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getapellidoPaterno() {
		return apellidoPaterno;
	}
	public String getapellidoMaterno() {
		return apellidoMaterno;
	}
	public int getNota1() {
		return nota1;
	}
	public int getNota2() {
		return nota2;
	}	
	public int getNota3() {
		return nota2;
	}
	public int getNota4() {
		return nota2;
	}
	//  Operaciones públicas
	public double promedio() {
		return (nota1 + nota2 + nota3 + nota4) / 4.0;
	}
	
}