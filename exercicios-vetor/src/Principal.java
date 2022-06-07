
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {4,1,2,80,8,78,7,88};
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		System.out.println("Imprimindo o vetor");
		int maior = numeros[0];
		int menor = numeros[0];
		float media = 0;
		boolean temRepetidos = false;
		
		for (int i = 0; i < numeros.length; i++) {
		  System.out.println("numeros[" + i + "] = " + numeros[i]);
		  if (numeros[i] > maior)
			  maior = numeros[i];
		  if (numeros[i] < menor)
			  menor = numeros[i];
		  media += numeros[i];
		  
		  for (int j = i+1; j<numeros.length; j++) 
			  if (numeros[i] == numeros[j]) 
				  temRepetidos = true; 
		}
		
		media = media / numeros.length;
		System.out.println("O maior é: " + maior);
		System.out.println("O menor é: " + menor);
		System.out.println("A média é: " + String.format("%.2f", media));
		if (temRepetidos) 
			System.out.println("Tem repetidos");
		else 
			System.out.println("Não tem repetidos");  
		
		
	}

}
