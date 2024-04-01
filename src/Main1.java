public class Main1 {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.Dono = "João";
        conta1.agencia = "222-2";
        conta1.num = 1234;
        conta1.saldo = 2000;

        Conta conta2 = conta1;

        System.out.println("Saldo conta 1: " + conta1.saldo);
        System.out.println("Saldo conta 2: " + conta2.saldo);

        System.out.println(conta1);
        System.out.println(conta2);

    }
}
