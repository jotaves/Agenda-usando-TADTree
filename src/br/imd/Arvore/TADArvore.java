package br.imd.Arvore;

import br.imd.Agenda.Pessoa;

public class TADArvore{
	private Node<T> raiz;

	public void inserir(Node<T> n) {
	   if (raiz.getConteudo() == null) {
	        this.raiz = n;
	        return;
	   }
	   else{
	        this.inserir(raiz, n);
	    }
	}
	
	private inserir(Node<T> pai, Node<T> n){
        int compR = n.getConteudo().getNome().compareToIgnoreCase(this.pai.getConteudo().getNome());
            
        if(compR < 0 && pai.getLeft() == null){
            pai.setLeft();
        }
        
        else if(compR < 0 && pai.getLeft() != null){
            inserir(pai.getLeft(), n);
        }
        
        else if(compR > 0 && pai.getRight() == null){
            pai.setRight(n);
        }

        else if(compR > 0 && pai.getRight() != null){
            inserir(pai.getLeft(), n);
        }
        // top! topissimo! topper!
	}

	public void buscarLargura(Node<T> n) {
        
	}

	public void buscarProfundidade(Node<T> n) {
        
	}

	public void remover(Node<T> n) {
        
	}
	
	public int getProfundidade(Node<T> n){
	    int prof = 0;
		if(this.raiz == n){
		    return prof;
		}
		
		Node<T> certo = raiz;
		
		while(certo != n){
		    int compR = n.getConteudo().getNome().compareToIgnoreCase(this.certo.getConteudo().getNome());
	        
	        if(CompR < 0) {
	            certo = certo.getLeft());
	        }
	        else if(CompR > 0) {
	            certo = certo.getRight());
	        }
	        
	        prof++;
		}
		
		return prof;
	}
	
	public int getAltura(Node<T> n){
	    if (n == null) {
	        return -1;
	    }
	    else {
	        // altura da sub-árvore esquerda
	        int ae = getAltura(n.getLeft());
	        // altura da sub-árvore direita
	        int ad = getAltura(n.getRight());
	        
	        // retorna a maior altura entre as sub-árvores
	        if (ae < ad) return ad + 1;
	        else return ae + 1;
	    }
	}
	
	public Node<T> getMenor(){
	    Node<T> n = raiz;
	    
	    while (n.getLeft().getConteudo() != null) {
	        n = n.getLeft();
	    }
	    
		return n;
	}
	
	public Node<T> getMaior(){
	    Node<T> n = raiz;
	    
	    while (n.getRight().getConteudo() != null) {
	        n = n.getRight();
	    }
	    
		return n;
	}
	
	private void imprimirPre(Node<T> n) {
	    if(n.getConteudo() != null) {
	        System.out.println("\t" + n.getConteudo());
		    imprimirPre(n.getLeft());
		    imprimirPre(n.getRight());
	    }
	}
	
	public void imprimirPre(){
	    System.out.println("Arvore em pré-fixo: \n");
	    imprimirPre(raiz);
	}
	
	public void imprimirPos(){
		System.out.println("Arvore em pos-fixo: \n");
		this.imprimirPos(raiz);
	}
	
	private void imprimirPos(Node<T> n){
	    if(n.getConteudo() != null){
	         System.out.println("\t" + n.getConteudo();
	         imprimirPos(n.getRight());
	         imprimirPos(n.getLeft());
	    }
	}
}
