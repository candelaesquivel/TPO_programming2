package api;

public interface ColaPrioridadTDA {

	
	/**
	* @Tarea_Nombre: Inicializa_InicializarCola.
	* @Tarea_Descripci�n: Inicializa la cola para comenzar a trabajarla.
	* @Par�metros: Recibe un int con el tama�o de la cola.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: No tiene precondiciones.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public void inicializarCola(int x); //COSTO: O(1).

	
	/**
	* @Tarea_Nombre: Agregar_AcolarPrioridad.
	* @Tarea_Descripci�n: Agrega un elemento con su prioridad a una cola.
	* @Par�metros: Recibe un int con el valor y un int con la prioridad.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La cola debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public void acolarPrioridad(int x, int prioridad); //COSTO: O(n).

	
	/**
	* @Tarea_Nombre: Eliminar_Desacolar.
	* @Tarea_Descripci�n: Elimina el elemento de mayor prioridad de una cola.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: La cola debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: Si la cola est� vac�a devuelve la excepcion tipo RuntimeException con el mensaje "La cola est� vac�a".
	*/
	public void desacolar(); //COSTO: O(1).

	
	/**
	* @Tarea_Nombre: EstaVac�a_colaVacia.
	* @Tarea_Descripci�n: Permite saber si una cola con prioridad est� vac�a.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: Retorna un booleano. Devuelve False si la cola no est� vac�a y True si lo est�.
	* @Precondiciones: La cola debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: No tiene excepciones.
	*/
	public boolean colaVacia(); //COSTO: O(1).

	
	/**
	* @Tarea_Nombre: RetornaPrimero_Primero.
	* @Tarea_Descripci�n: Permite conocer el elemento de mayor prioridad de una cola.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: Retorna un int con el valor del elemento de mayor prioridad.
	* @Precondiciones: La cola debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: Si la cola est� vac�a devuelve la excepcion tipo RuntimeException con el mensaje "La cola est� vac�a".
	*/
	public int primero(); //COSTO: O(1).

	
	/**
	* @Tarea_Nombre: RetornaPrioridad_Prioridad.
	* @Tarea_Descripci�n: Permite conocer la prioridad del elemento de mayor prioridad.
	* @Par�metros: No recibe par�metros.
	* @Devuelve: Retorna un int con la prioridad.
	* @Precondiciones: La cola debe estar inicializada.
	* @Postcondiciones: No tiene postcondiciones.
	* @Excepci�n: Si la cola est� vac�a devuelve la excepcion tipo RuntimeException con el mensaje "La cola est� vac�a".
	*/
	public int prioridad(); //COSTO: O(1).

}
