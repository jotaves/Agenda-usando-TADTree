package br.imd.Arvore;

public class TADArvore<T extends Comparable<T>>{
	private Node<T> raiz;
	
	public TADArvore() {
		this.raiz = null;
	}

	public void inserir(T t) {
		Node<T> n = new Node<T>(t);
		
		if (raiz == null) {
	        this.raiz = n;
		}
		else{
			this.inserir(raiz, n);
		}
	}
	
	private void inserir(Node<T> pai, Node<T> n){
		// modificado
        int compR = n.getConteudo().compareTo(pai.getConteudo());

        if(compR < 0 && pai.getLeft() == null){
            pai.setLeft(n);
        }
        
        else if(compR < 0 && pai.getLeft() != null){
            inserir(pai.getLeft(), n);
        }
        
        else if(compR > 0 && pai.getRight() == null){
            pai.setRight(n);
        }

        else if(compR > 0 && pai.getRight() != null){
            inserir(pai.getRight(), n);
        }
	}

	public int buscarLargura(T obj) {
        
        
        return 0;
	}

	public int buscarProfundidadePosicao(T obj) {
		if (raiz == null) return -1;
		int posicao = 0;
        buscarProfundidadePosicao(raiz, obj, posicao);
        return posicao;
	}
	
	private int buscarProfundidadePosicao(Node<T> n, T obj, int posicao){
	    if(n.getConteudo() == obj){
	    	System.out.println();
	        return posicao;
	    }
	    else{
	    	if (n.getLeft() != null) {
	    		buscarProfundidadePosicao(n.getLeft(), obj, ++posicao);
	    	}
	    	if (n.getRight() != null) {
	    		buscarProfundidadePosicao(n.getRight(), obj, ++posicao);
	    	}
	    	return posicao;
	    }
	}
	
	public Node<T> buscarProfundidadeObj(T obj) {
        return this.buscarProfundidadeObj(raiz, obj);
	}
	
	private Node<T> buscarProfundidadeObj(Node<T> n, T obj){
		Node<T> buscado = new Node<T>(obj);
		
	    if(n.getConteudo().compareTo(buscado.getConteudo()) == 0){
	        return n;
	    }
	    else{
	        this.buscarProfundidadeObj(n.getLeft(), obj);
	        this.buscarProfundidadeObj(n.getRight(), obj);
	    }
	    
	    // não encontrou
		return null;
	}

	public void remover(T obj) {
        
	}
	
	public int getProfundidade(Node<T> n){
	    int prof = 0;
		if(this.raiz == n){
		    return prof;
		}
		
		Node<T> certo = raiz;
		
		while(certo != n){
		    int compR = n.getConteudo().compareTo(certo.getConteudo());
	        
	        if(compR < 0) {
	            certo = certo.getLeft();
	        }
	        else if(compR > 0) {
	            certo = certo.getRight();
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
	    if(n != null) {
	        System.out.print("\t" + n.getConteudo());
		    imprimirPre(n.getLeft());
		    imprimirPre(n.getRight());
	    }
	}
	
	public void imprimirPre(){
	    System.out.print("Arvore em pré-fixo: [\n");
	    	imprimirPre(raiz);
	    System.out.println("\n]");
	}
	
	public void imprimirPos(){
		System.out.print("Arvore em pós-fixo: [\n");
			imprimirPos(raiz);
		System.out.println("\n]");
	}
	
	private void imprimirPos(Node<T> n){
	    if(n != null){
	         imprimirPos(n.getLeft());
	         imprimirPos(n.getRight());    
	         System.out.print("\t" + n.getConteudo());
	    }
	}
}
