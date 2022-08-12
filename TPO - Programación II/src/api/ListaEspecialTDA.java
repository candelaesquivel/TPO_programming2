package api;


public interface ListaEspecialTDA {
	
	public static class NodoDoble {
		public int info;
		public NodoDoble anterior;
		public NodoDoble siguiente;
	}
	
	
	/**
	* @Tarea_Nombre: Inicializa_InicializarLista.
	* @Tarea_Descripci�n: Inicializa la lista para comenzar a trabajarla.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: No tiene precondici�n.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public void inicializarLista(); //COSTO: O(1).
	

	/**
	* @Tarea_Nombre: Tama�o_Size.
	* @Tarea_Descripci�n: Devuelve el tama�o de la lista, es decir, la cantidad de elementos que tiene la lista.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: Devuelve un int con la cantidad de elementos de la lista.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public int size(); //COSTO: O(1).
	
	
	/**
	* @Tarea_Nombre: Agregar_Append.
	* @Tarea_Descripci�n: Agrega elementos al final de la lista.
	* @Par�metros: Recibe un int con el valor a agregar.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: Incrementa uno el tama�o de la lista.
	* @Excepci�n: No tiene excepciones.
	*/
	public abstract void append(int valor); //COSTO: O(1).
	
	
	/**
	* @Tarea_Nombre: Vac�aLista_Clear.
	* @Tarea_Descripci�n: Elimina todos los elementos de la lista.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: El tama�o de la lista es igual a 0.
	* @Excepci�n: No tiene excepciones.
	*/
	public abstract void clear(); //COSTO: O(1).
	
	
	/**
	* @Tarea_Nombre: Copiar_Copy.
	* @Tarea_Descripci�n: Copia los elementos de una lista en una lista nueva.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: Retorna la copia de la lista.
	* @Precondiciones: No tiene precondiciones.
	* @Postcondiciones: No hay postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public abstract ListaEspecialTDA copy();  //COSTO: O(n)
	
	
	/**
	* @Tarea_Nombre: Contar_Count.
	* @Tarea_Descripci�n: Cuenta la cantidad de apariciones que hay de un valor en la lista.
	* @Par�metros: Recibe un int con el valor.
	* @Devuelve: Retorna un int con la cantidad de apariciones de ese valor en la lista.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: No hay postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public abstract int count(int valor);  //COSTO: O(n).
	
	
	/**
	* @Tarea_Nombre: AgregaLista_Extend.
	* @Tarea_Descripci�n: Agrega la lista recibida por par�metro al final de la lista original.
	* @Par�metros: Recibe una lista de tipo ListaEspecialTDA.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: Incrementa el tama�o de la lista original.
	* @Excepci�n: No tiene excepciones.
	*/
	public abstract void extend(ListaEspecialTDA lista);  //COSTO: O(n).
	
	
	/**
	* @Tarea_Nombre: Indice_Index.
	* @Tarea_Descripci�n: Busca en qu� posici�n de la lista se encuentra el elemento valor;
	* si aparece varias veces, devuelve la primera. 
	* @Par�metros: Recibe un int con el valor a buscar.
	* @Devuelve: Retorna la posici�n del valor en la lista.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: No tiene postcondici�n.
	* @Excepci�n: Cuando no existe el elemento lanza una excepci�n de 
	* tipo RuntimeException con el mensaje "No existe en la lista".
	*/
	public abstract int index(int valor); //COSTO: O(n).
	
	
	/**
	* @Tarea_Nombre: EliminaIndice_Pop.
	* @Tarea_Descripci�n: Elimina el elemento de la posici�n enviada por par�metro. Permite la utilizaci�n de �ndices negativos.
	* @Par�metros: Recibe un int con la posici�n del valor a eliminar.
	* @Devuelve: Devuelve el valor eliminado.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: Decrementa uno el tama�o de la lista.
	* @Excepci�n: En caso de sobrepasar el tama�o de la lista, lanza una excepci�n 
	* de tipo RuntimeException con el mensaje "No existe en la lista ese �ndice".
	*/
	public abstract int pop(int index);   //COSTO: O(n).
	
	
	/**
	* @Tarea_Nombre: EliminaValor_Remove.
	* @Tarea_Descripci�n: Elimina el elemento valor de la lista; si aparece varias veces, elimina la primera.
	* @Par�metros: Recibe un int con el valor a eliminar.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: Decrementa uno el tama�o de la lista.
	* @Excepci�n: En caso de no existir el valor a eliminar, lanza una excepci�n de 
	* tipo RuntimeException con el mensaje "No existe en la lista ese valor".
	*/
	public abstract void remove(int valor);   //COSTO: O(n).
	
	
	/**
	* @Tarea_Nombre: Invertir_Reverse.
	* @Tarea_Descripci�n: Invierte la lista.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: La lista est� invertida.
	* @Excepci�n: No tiene excepciones.
	*/
	public abstract void reverse();  //COSTO: O(n).
	
	
	/**
	* @Tarea_Nombre: Ordenar_Sort.
	* @Tarea_Descripci�n: Ordena los elementos de la lista de menor a mayor segun el valorde dichos elementos.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: La lista se encuentra ordenada.
	* @Excepci�n: No tiene excepciones.
	*/
	public abstract void sort();  //COSTO: O(n^2).
	
	
	/**
	* @Tarea_Nombre: EstaOrdenado_isSorted.
	* @Tarea_Descripci�n: Valida si la lista est� ordenada tanto de forma creciente como decreciente.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public abstract boolean isSorted();  //COSTO: O(n).
	
	
	/**
	* @Tarea_Nombre: Buscar_binarySearch.
	* @Tarea_Descripci�n: Busca el valor ingresado mediante una b�squeda binaria.
	* @Par�metros: Recibe un int con el valor a buscar.
	* @Devuelve: Retorna un boolean. False si no encontr� el elemento y True si lo encontr�.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: Si la lista no est� ordenada (creciente o decrecientemente), 
	* lanza una excepci�n de tipo RuntimeException con el mensaje "Lista no ordenada".
	*/
	public abstract boolean binarySearch(int valor); //COSTO: O(n^2)
	
	
	/**
	* @Tarea_Nombre: Imprime_Print.
	* @Tarea_Descripci�n: Imprime por pantalla los elementos de la lista.
	* @Par�metros: No recibe par�metros.
	* @Devuelve:No retorna ya que es de tipo void.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public void print();  //COSTO: O(n).
	
	
	/**
	* @Tarea_Nombre: DevuelveValor_Get.
	* @Tarea_Descripci�n: Devuelve el valor del �ndice pasado por par�metro.
	* @Par�metros: Recibe un int con el �ndice.
	* @Devuelve:Retorna un int con el valor.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public int get(int index);  //COSTO: O(n).
	
	/**
	* @Tarea_Nombre:DevuelvePrimero_Primero.
	* @Tarea_Descripci�n: Devuelve el primer elemento de la lista.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: Retorna un elemento tipo NodoDoble.
	* @Precondiciones: La lista debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public NodoDoble primero();  //COSTO: O(1).
	

}