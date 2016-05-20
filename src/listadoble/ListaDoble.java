package listadoble;

public class ListaDoble {
	public Nodo inicio;
	public void agregar(String dato){
	
			Nodo nodo=new Nodo(dato);
			
			if (inicio==null){
				inicio=nodo;
			}
			else if(inicio.siguiente==null){
				inicio.siguiente=nodo;
				nodo.anterior=inicio; 
			}
			else{
				Nodo apuntador=inicio;
				while(apuntador.siguiente!=null){
					apuntador=apuntador.siguiente;
				}
				apuntador.siguiente=nodo;
				nodo.anterior=apuntador;
			}
	}
	public void listar(){
		Nodo apuntador=inicio;
		while(apuntador!=null){
			System.out.println(apuntador);
			apuntador=apuntador.siguiente;
		}
	}
	
	
}

