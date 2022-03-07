import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		Circulo c = new Circulo(10, 15, "Amarelo", "Preta", 6);
		Quadrado q = new Quadrado(12, 20, "Azul", "Rosa", 10);
		Retangulo r = new Retangulo(7, 15, "Verde", "Violeta", 20, 14);
		
		Circulo c1 = new Circulo(10, 15, "Amarelo", "Preta", 7);
		Quadrado q1 = new Quadrado(12, 20, "Azul", "Rosa", 9);
		Retangulo r1 = new Retangulo(7, 15, "Verde", "Violeta", 15, 18);
		
		List<FormaBidimensional> listaObjetos = new ArrayList<FormaBidimensional>();
		
		listaObjetos.add(c);
		listaObjetos.add(q);
		listaObjetos.add(r);
		
		listaObjetos.add(c1);
		listaObjetos.add(q1);
		listaObjetos.add(r1);
		
		//Não se pode instanciar uma classe abstrata:
		//FormaBidimensional teste = new FormaBidimensional(5, 5, "Preto", "Preto");
		
		for(int i = 0; i < listaObjetos.size() ; i++) {
			FormaBidimensional f = listaObjetos.get(i);
			
			System.out.println(f.getClass().getName() + ": " + f.calculaArea());
		}
		
	}

}
