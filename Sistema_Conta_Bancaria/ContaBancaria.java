public class ContaBancaria {

    private String titular;
    private double saldo;
    private StatusConta status;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.status = StatusConta.EM_ANALISE;
    }

    public boolean depositar(double valor) {
        if (status == StatusConta.ATIVA && valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (status == StatusConta.ATIVA && valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(ContaBancaria conta, double valor) {
        if (conta != null
                && conta.status == StatusConta.ATIVA
                && status == StatusConta.ATIVA
                && valor > 0
                && valor <= saldo
                && this != conta) {

            this.saldo -= valor;
            conta.depositar(valor);
            return true;
        }
        return false;
    }

    public boolean aprovar() {
        if (status == StatusConta.EM_ANALISE) {
            this.status = StatusConta.ATIVA;
            return true;
        }
        return false;
    }

    public boolean bloquear() {
        if (status == StatusConta.ATIVA) {
            this.status = StatusConta.BLOQUEADA;
            return true;
        }
        return false;
    }

    public boolean desbloquear() {
        if (status == StatusConta.BLOQUEADA) {
            this.status = StatusConta.ATIVA;
            return true;
        }
        return false;
    }

    public boolean encerrar() {
        if (status == StatusConta.ATIVA && saldo == 0) {
            this.status = StatusConta.ENCERRADA;
            return true;
        }
        return false;
    }

    public boolean suspender() {
        if (status == StatusConta.ATIVA) {
            this.status = StatusConta.SUSPENSA;
            return true;
        }
        return false;
    }

    public boolean ativar() {
        if (status == StatusConta.SUSPENSA) {
            this.status = StatusConta.ATIVA;
            return true;
        }
        return false;
    }
}
