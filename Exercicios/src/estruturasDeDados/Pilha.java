package estruturasDeDados;

public class Pilha {
    private No refNo;

    public Pilha(){
        refNo = null;
    }

    public boolean isEmpty(){
        return refNo == null ? true : false;
    }

    public No top(){
        return refNo;
    }

    public void push(No novoNo){
        No auxNo = refNo;
        refNo = novoNo;
        refNo.setProximoNo(auxNo);
    }

    public No pop(){
        if(!isEmpty()){
            No excluido = refNo;
            refNo = refNo.getProximoNo();
            return excluido;
        }else{
            return null;
        }
    }

}