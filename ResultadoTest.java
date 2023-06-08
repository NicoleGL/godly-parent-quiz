public class ResultadoTest
{
	static String palabraMasFrecuente (String[] arr){
		int[] repeticiones = new int[numPalabras(arr)];
		for(int i = 0; i < repeticiones.length; i++)
			repeticiones[i] = vecesQueSale(arr[i], arr);
		int masRepes = numMayor(repeticiones);
		boolean para = false;
		String[] masFrecuentes = new String[numPalabras(arr)];
		String res = "";
		for(int i = 0; i < arr.length; i++) {
			if(para) {
				res = "Empate";
			} else if((vecesQueSale(arr[i], arr) == masRepes) && !para){
				if (!res.equals("") && !res.equals(arr[i]))
					para = true;
				res = arr[i];
			}
		}
		return res;
	}
	
	static int numMayor (int[] arr){
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	static int vecesQueSale (String palabra, String[] arr){
		int res = 0;
		for(int i = 0; i < arr.length; i++)
			if(arr[i].equals(palabra))
				res += 1;
		return res;
	}
	
	static int numPalabras (String[] arr){
		double res = 0;
		for(int i = 0; i < arr.length; i++)
			res = res + 1.0/vecesQueSale(arr[i], arr);
		return (int)(res + 0.5);
	}
	
	public static void main (String[] args)
	{
		System.out.println(palabraMasFrecuente(args));
		System.out.println(vecesQueSale(palabraMasFrecuente(args), args));
	}
}