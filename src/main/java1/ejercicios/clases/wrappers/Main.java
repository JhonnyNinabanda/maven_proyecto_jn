package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		
		byte datoByte = 2;					//Primitivo
		Byte datoByteWrapper = 3; 			// Wrapper
		System.out.println("Primitivo: " + datoByte);
		System.out.println("Wrapper: " + datoByteWrapper);
		//Conversion
		byte datoByte1 =6;
		Byte datoConvertido =datoByte1;
		System.out.println("Byte convertido: " + datoConvertido );
		//Conversion 2
		Byte datoByte2 = 8;
		byte byteConvertido = datoByte2.byteValue();
		
		short datoShort = 1;			//Primitivo
		Short datoShortWrapper = 1;		// Wrapper
		System.out.println("Primitivo: " + datoShort);
		System.out.println("Wrapper: " + datoShortWrapper);
		// Coversion
		short datoShort1 = 4;
		Short shortConvertido = datoShort1;
		System.out.println("Short convertido: " + shortConvertido );
		//Conversion 2
		Short shortInteger2 = 8;
		short shortConvertido2 = shortInteger2.shortValue();
		
		int edad = 45;				//Primitivo
		Integer edadWrapper = 48;	// Wrapper
		System.out.println("Primitivo: " + edad);
		System.out.println("Wrapper: " + edadWrapper);
		//Coversion
		int edad1 = 30;
		Integer integerConvertido = edad1;
		//Conversion 2
		Integer Integer2 = 48;
		int intConvertido2 = Integer2.intValue();

		long valor = 4554654L;			//Primitivo
		Long ValorWrapper = 54545L;		// Wrapper
		System.out.println("Primitivo: " + valor);
		System.out.println("Wrapper: " + ValorWrapper);
		//Coversion
		long valor5 = 45454540L;
		Long longConvertido = valor5;
		//Conversion 2
		Long long2 = 4566568L;
		long longConvertido2 = long2.longValue() ;
		
		boolean valor1 = true;				//Primitivo
		Boolean valor1Wrapper = false;		// Wrapper
		System.out.println("Primitivo: " + valor1);
		System.out.println("Wrapper: " + valor1Wrapper);
		boolean valor6 = false;
		Boolean booleanConvertido = true;
		//Conversion 2
		Boolean boolean2 = true;
		boolean booleanConvertido2 = boolean2.booleanValue();
		
		float numeroGrande = 2454.45f;				//Primitivo
		Float numeroGrandeWrapper = 45674.5454f;	// Wrapper
		System.out.println("Primitivo: " + numeroGrande);
		System.out.println("Wrapper: " + numeroGrandeWrapper);
		//Coversion
		float saldo5 = 45454540f;
		Float floatConvertido = saldo5;
		//Conversion 2
		Float float2 = 4566568f;
		float floatConvertido2 = float2.floatValue() ;
		
		double saldo = 4154545.25;			//Primitivo
		Double saldoWraper = 454541.23 ;	// Wrapper
		System.out.println("Primitivo: " + saldo);
		System.out.println("Wrapper: " + saldoWraper);
		//Coversion
		double numero1 = 45454540;
		Double doubleConvertido = numero1;
		//Conversion 2
		Double double2 = 4578978.23;
		double doubleConvertido2 = double2.doubleValue();
		
		char genero = 'A';					//Primitivo
		Character generoWrapper = 'B';		// Wrapper
		System.out.println("Primitivo: " + genero);
		System.out.println("Wrapper: " + generoWrapper);
		//conversion
		char genero1 ='X';
		Character charConvertido = genero1;
		Character charConvertido2 = 'Y';
		char charConvertido3 = charConvertido2.charValue();
		
		
		

	}

}
