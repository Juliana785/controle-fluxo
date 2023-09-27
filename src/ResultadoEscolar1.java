public class ResultadoEscolar1 {
    public static void main(String[] args) {
        
        int nota = 10;

        if(nota >=7)
        System.out.println("Aprovado!");

        else if (nota >= 5 && nota < 7) // Essa expressão sempre tem que retornar true or false
        System.out.println("Recuperação!");

        else
        System.out.println("Reprovado :(");

    }
}
