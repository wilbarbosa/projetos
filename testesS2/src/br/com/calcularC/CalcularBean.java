package br.com.wilian;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalcularBean {

	
	private Numero numero = new Numero();

	 public Numero getNumeros() {
	        return numero;
	    }
	 
	 public void limpar() {
		 numero.setNumA(null);
		 numero.setNumB(null);
		 numero.setNumC(null);
	 }
	
	public void calcular() {
		
		StringBuilder numC = new StringBuilder();

        char[] arrayA = numero.getNumA().toCharArray();
        char[] arrayB = numero.getNumB().toCharArray();

        int tamanho = 0;
        if(arrayA.length >= arrayB.length) {
        	tamanho = arrayA.length;
        }else {
        	tamanho = arrayB.length;
        }

        for (int i = 0; i < tamanho; i++) {

            if (arrayA.length > i) {
                numC.append(arrayA[i]);
            }

            if (arrayB.length > i) {
                numC.append(arrayB[i]);
            }
        }

        numero.setNumC(Long.valueOf(numC.toString()));

        if (numero.getNumC() > 1000000) {
        	numero.setNumC(new Long(-1));
        }

	}
}
