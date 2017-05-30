package itba.tp.controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;

import sun.misc.Queue;

public class Tree<T> {
	private T value;
	private ArrayList<Tree<T>> children;
	public Tree(T value) {
		this.value = value;
		children = new ArrayList<Tree<T>>();
	}
	public void AddChild(T value){
		children.add(new Tree<T>(value));
	}
	public Tree<T> getChild(int index){
		return children.get(index);
	}
	public void removeChild(T value){
		for (Tree<T> tree : children) {
			if(tree.value.equals(value))
				children.remove(tree);
		}	
	}
	//Genera un documento .dot diferenciando por niveles el jugador imprimiento el valor de los nodos del arbol
	public void generarDOT() throws FileNotFoundException, InterruptedException{
		Tree<T> arbol = this;
		//Reemplaza el archivo si ya existe.
		PrintWriter writer = new PrintWriter("tree.dot");
		writer.println("digraph tree{");
		//Recorro por nivel, visito una vez cada nodo
		Queue<Tree> cola = new Queue<Tree>();
		Queue<Tree> cola2 = new Queue<Tree>();
		cola.enqueue(arbol);
		int level = 0, i;
		boolean flag = true;
		while(!(cola.isEmpty() && cola2.isEmpty())){
			Tree aux;
			if(flag){
				if(!cola.isEmpty()){
					aux = cola.dequeue();
					for (i=0;i<aux.children.size();i++) {
						writer.println(aux.value +" -> "+ ((Tree)aux.children.get(i)).value + ";");
						cola2.enqueue(((Tree)aux.children.get(i)));
					}
				}else{
					flag=!flag;
				}
			}else{
				if(!cola2.isEmpty()){
					aux = cola2.dequeue();
					writer.println(aux.value + " [shape=box]");
					for (i=0;i<aux.children.size();i++) {
						writer.println(aux.value +" -> "+ ((Tree)aux.children.get(i)).value + ";");
						cola.enqueue(((Tree)aux.children.get(i)));
					}
				}else{
					flag=!flag;
				}	
			}
		}
		writer.println("}");
		writer.close();
	}
}
