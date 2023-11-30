package tp1.ej6;

import java.util.Iterator;

public class IteratorLinkedList<T> implements Iterator<T>{
  private Node<T> nodo;

  public IteratorLinkedList(Node nodo){
    this.nodo = nodo;
  }  

  // Recordar que el metodo hasNext consulta si el elemento actual es o no null, NO pregunta por el siguiente
  @Override
  public boolean hasNext() {
    return (this.nodo != null);  
  }

  /*
   * Recordar que el metodo next hace 2 procesos al mismo tiempo, tanto devuelve el elemento actual, 
   * como tambien se posiciona en el siguiente elemento
   */
  @Override
  public T next() {
    T aux = this.nodo.getInfo();
    this.nodo = this.nodo.getNext();

    return aux;
  }

  public T currentValue(){
    return this.nodo.getInfo();
  }
  
}
