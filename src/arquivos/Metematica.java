package arquivos;

public class Metematica {

    public double v1;
    public double v2;
    private String operacao;

    public double dividir() throws ArithmeticException {
        //Queremeos dividir v1 por v2

        return v1 / v2;
    }

    public void setOperacao(String operacao) throws Exception {
        if (operacao.length() < 3) {
            throw new Exception("Deve ter pelo menos 3 letras");
        } else {
            this.operacao = operacao;
        }

    }
}