package analizadorLexico;

public class SplitExample {

	 public static void main(String[] args) {
		 
		 int j = 0;
		 
		 Linea lineaLeida = new Linea();
		 
		 lineaLeida.setLineaAnalizar("03 WVDT0025-NRO-MENSAJE              PIC X(04) VALUE '0025'.");
		 lineaLeida.obtenerTokens();
		 
		 while(j<lineaLeida.arrayTokens.length){
			 System.out.print("Token n�");
			 System.out.print(j);
			 System.out.print(": ");
			 System.out.println(lineaLeida.arrayTokens[j]);
			 j++;
			 }
		 
		 
		 
	 }
	
	
	
	
}
