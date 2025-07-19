//inserção recusiva
//exist recursivo

//remoção do maior com recursao
public T removerMaior(){
   return removerMaiorRecursivo(raiz);
}
private T removerMaiorRecursivo(NoTriplo<T> maior){
    if(maior==null){
        throw new UnderflowException("árvore vazia");
    }
    if(maior.getFilhodireito()==null){
        return maior.getDado();
    }else{
        removerMaiorRecursivo(maior.getFilhodireito());
    }
}


//remoção do maior - interativo
public T removerMaior(){
    return removerMaiorInterativo(raiz);
}
private T removerMaiorInterativo(NoTriplo<T> maior){
    if(maior==null){
        throw new UnderflowException("árvore vazia");
    }
    NoTriplo<T> aux=maior;
    while(aux.getFilhodireito()!=null)
        aux=aux.getFilhodireito();
    }
    return aux.getDado();
}



//Apagar    encontra o maior elemento da sub-árvore esquerda, do nó a ser removido.
public T apagar(T dado) {
    //verifica se a arvore não está vazia
    if (raiz == null) {
        throw new UnderflowException("árvore vazia");
    }
    // verifica também se o elemento existe e onde está
    NoTriplo<T> auxiliar = buscar(dado);
    if (auxiliar == null) {
        throw new NoSuchElementException("Elemento inválido- não encontrado");
    }
    //verificar  em qual caso ele se encontra
    //caso 1 - sem filhos- um nó folha
    if (auxiliar.getFilhodireito() == null && auxiliar.getFilhoesquerdo() == null) {
        apagarFolha(auxiliar);
        //caso 2 - nó com 1 filho
    } else if (auxiliar.getFilhodireito() == null || auxiliar.getFilhoesquerdo() == null) {
        apagarCom1Filho(auxiliar);
        //caso 3 nó com 2 filhos
    } else {
        apagarCom2Filhos(auxiliar);
    }
    return dado;
}
 private void apagarFolha(NoTriplo<T> auxiliar){
    NoTriplo<T> pai = auxiliar.getGenitor();
    if(pai.getFilhodireito()==null){
        pai.setFilhoesquerdo(null);

    }else{
        pai.setFilhodireito(null);
    }
     auxiliar.setGenitor(null);
 }
private void apagarCom1Filho(NoTriplo<T> auxiliar){
    NoTriplo<T> vo= auxiliar.getGenitor();
    NoTriplo<T> neto;
    if(auxiliar.getFilhodireito()==null){
        neto=auxiliar.getFilhoesquerdo();
    }else{
        neto=auxiliar.getFilhodireito();
    }
    if(avo==null){
        raiz=neto;
        raiz.setGenitor(null);
    }else {
        neto.setGenitor(vo)
        if (auxiliar.equals(vo.getFilhodireito())) {
            vo.setFilhodireito(neto);
        } else {
            vo.setFilhodireito(neto);
        }
    }
}
private void apagarCom2Filhos(NoTriplo<T> auxiliar){
    NoTriplo<T> vo= auxiliar.getGenitor();
    NoTriplo<T> neto;
    if(auxiliar.getFilhodireito()==null){
        neto=auxiliar.getFilhoesquerdo();
    }else{
        neto=auxiliar.getFilhodireito();
    }
    if(avo==null){
        raiz=neto;
        raiz.setGenitor(null);
    }else {
        neto.setGenitor(vo)
        if (auxiliar.equals(vo.getFilhodireito())) {
            vo.setFilhodireito(neto);
        } else {
            vo.setFilhodireito(neto);
        }
    }
}




































}
private T removerMaiorRecursivo(NoTriplo<T> maior){
    if(maior==null){
        throw new UnderflowException("árvore vazia");
    }
    if(maior.getFilhodireito()==null){
        return maior.getDado();
    }else{
        removerMaiorRecursivo(maior.getFilhodireito());
    }
}
//remoção do maior - interativo
public T removerMaior(){
    return removerMaiorInterativo(raiz);
}
private T removerMaiorInterativo(NoTriplo<T> maior){
    if(maior==null){
        throw new UnderflowException("árvore vazia");
    }
    NoTriplo<T> aux=maior;
    while(aux.getFilhodireito()!=null)
        aux=aux.getFilhodireito();
}
    return aux.getDado();
}







//remoção do menor com recursao
public T removerMenor(){
    return removerMenorRecursivo(raiz);
}
private T removerMenorRecursivo(NoTriplo<T> menor){
    if(menor==null){
        throw new UnderflowException("árvore vazia");
    }
    if(menor.getFilhoesquerdo()==null){
        return menor.getDado();
    }else{
        removerMenorRecursivo(menor.getFilhoesquerdo());
    }
}

//remoção do menor - interativo
public T removerMenor(){
    return removerMenorInterativo(raiz);
}
private T removerMenorInterativo(NoTriplo<T> maior){
    if(maior==null){
        throw new UnderflowException("árvore vazia");
    }
    NoTriplo<T> aux=maior;
    while(aux.getFilhoesquerdo()!=null)
        aux=aux.getFilhoesquerdo();
}
    return aux.getDado();
}