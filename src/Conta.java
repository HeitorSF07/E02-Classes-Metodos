public class Conta {
    String Dono;
    double saldo;
    int num;
    String agencia;
    double limite;

    boolean depositar(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }


    boolean sacar(double valor) {
        if(valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }


    boolean transferir(Conta contaDestino, double valor) {
        boolean saqueRealizado = this.sacar(valor);
        if(saqueRealizado) {
            boolean depositoRealizado = contaDestino.depositar(valor);
            return depositoRealizado;
        } else {
            return false;
        }
    }
    void imprimir (){
        System.out.println("Dono: "+Dono);
        System.out.println("Número da conta: "+num);
        System.out.println("Saldo: "+saldo);
        System.out.println("Limite: "+limite);
    }
}

