import java.util.Arrays;

public class ArrayEx2 {

    public static void main(String args[]) {
        
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        
        // Criando uma cópia independente de primes
        long[] primes2 = Arrays.copyOf(primes, primes.length);
        
        System.out.println(primes2[0]); // Saída: 2
        primes2[0] = 5;
        System.out.println(primes[0]); // Saída: 2 (primes não foi modificado)
        
        // Exibindo todos os elementos do array primes2 usando for-each
        for (long prime : primes2) {
            System.out.println(prime);
        }
    }
 
}