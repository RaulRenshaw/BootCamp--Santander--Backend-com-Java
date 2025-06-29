public class ContaTerminal {
    int  numero;
    String agencia;
    String nomeCliente;
    double Saldo;

    public ContaTerminal(String nomeCliente, String agencia, int numero, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        Saldo = saldo;
    }
    public ContaTerminal() {
    }

    @Override
    public String toString() {
        return "Olá" +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", agencia='" + agencia + '\'' +
                "numero=" + numero +
                ", Saldo=" + Saldo + " já está disponível para saque.";
    }
}
