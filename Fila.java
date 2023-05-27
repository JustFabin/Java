package trab.aparecido.javaproject;

import java.util.ArrayList;
import java.util.List;

public class Fila {
	
	public int size;
	public DListNode head;
	public DListNode tail;

	public Fila() {

	this.size = 0;
	this.head = null;
	this.tail = null;
	}
	
	public void enqueue(Integer item) {
		DListNode novoNode = new
		DListNode(item);
		if (this.size == 0) {

		this.head = novoNode;
		this.tail = novoNode;
		this.size++;

		}
		else {

		this.tail.next = novoNode;
		this.tail = novoNode;
		this.size++;

		}

	}
	
	public Integer dequeue() {
		Integer trab;
		if (this.size == 0) {

		System.out.println("Stack empty ...");
		return null;

		}
		else {

		if (this.size == 1) {

		trab = this.head.item;
		this.head = null;
		this.tail = null;
		this.size = 0;
		return trab;

		}
		else {

		trab = this.head.item;
		this.head = this.head.next;
		this.head.prev = null;
		this.size--;
		return trab;
		}
	 }
  }
		
	public List<Integer> imprimeFila() {
		List<Integer> retorno = new ArrayList<>();
		DListNode p;
		p = this.head;
		if (this.size == 0 )

		System.out.println("Stack empty...");

		else {

		System.out.print( "( " );
		while ( p != null && p.item != null) {

		System.out.print ( p.item + " ");
		retorno.add(p.item);
		p = p.next;

		}
		System.out.print(")" + "\n");

	  }
		return retorno;
	}
}
