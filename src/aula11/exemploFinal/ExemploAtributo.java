package aula11.exemploFinal;

public class ExemploAtributo {
	public final double pi;
	//Para criar uma constante
	//public -> para ter acesso global
	//static -> para existir diretamente na classe
	//final -> para não ter seu valor modificado
	public static final double PI = 3.141592653589793;


	public ExemploAtributo(){
		pi = 3.14;
	}
}
