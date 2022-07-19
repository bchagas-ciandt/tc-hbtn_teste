public class OperacaoBasicaTeste {
    public static boolean testar_soma() {
        boolean isValido = false;
        if (OperacaoBasica.somar(5, 3) == 8) {
            isValido = true;
        }
        return isValido;
    }

    public static boolean testar_subtracao() {
        boolean isValido = false;
        if (OperacaoBasica.subtrair(5,3) == 2) {
            isValido = true;
        }
        return isValido;
    }

    public static boolean testar_multiplicacao() {
        boolean isValido = false;
        if (OperacaoBasica.multiplicar(5, 3) == 15) {
            isValido = true;
        }
        return isValido;
    }

    public static boolean testar_divisao() {
        boolean isValido = false;
        if (OperacaoBasica.dividir(9, 3) == 3) {
            isValido = true;
        }
        return isValido;
    }
}
