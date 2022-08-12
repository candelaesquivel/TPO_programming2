package api;

public interface HeapTDA {
	
	
	/**
	* @Tarea_Nombre: Insertar_Push
	* @Tarea_Descripci�n: Inserta elementos en el heap
	* @Par�metros: Recibe un tipo de dato int.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: No existen precodinciones.
	* @Postcondiciones: El heap mantiene su orden al haber insertado un elemento.
	* @Excepci�n: No tiene excepci�n.
	*/
    public void push(int x) ; //COSTO: O(log(n))

    
    /**
	* @Tarea_Nombre: Eliminar_Pop
	* @Tarea_Descripci�n: Elimina el primer elemento del Heap.
	* @Par�metros: No recibe par�mentros.
	* @Devuelve: No retorna ya que es de tipo void.
	* @Precondiciones: El Heap no debe estar vac�o.
	* @Postcondiciones: El heap mantiene su orden al haber eliminado el primer elemento.
	* @Excepci�n: No tiene excepci�n.
	*/
    public void pop() ; //COSTO: O(log(n))

    
    /**
	* @Tarea_Nombre: Retorna_Peek
	* @Tarea_Descripci�n: Retorna el primer elemento del Heap.
	* @Par�metros: No recibe par�mentros.
	* @Devuelve: Retorna un tipo de dato int que refiere al primer elemento del Heap.
	* @Precondiciones: El Heap no debe estar vac�o.
	* @Postcondiciones: No tiene postcondici�n.
	* @Excepci�n: No tiene excepci�n.
	*/
    public int peek(); // COSTO: O(1)

    
    /**
	* @Tarea_Nombre: HeapVac�o_isEmpty.
	* @Tarea_Descripci�n: Verifica si el Heap est� vac�o.
	* @Par�metros: No recibe par�mentros.
	* @Devuelve: Retorna un booleano. False si el Heap no est� vac�o y true si tiene elementos.
	* @Precondiciones: No hay precondici�n.
	* @Postcondiciones: No tiene postcondici�n.
	* @Excepci�n: No tiene excepci�n.
	*/
    public boolean isEmpty() ; // COSTO: O(1)

}