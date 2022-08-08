public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(1000);

        Conta cp = new ContaPoupanca();
        cc.transferir(300, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
