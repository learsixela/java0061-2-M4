package com.alkemy.f20260204;

import java.util.Arrays;

public class Cadenas {

	public static void main(String[] args) {
		// cadenas de caracteres => String
		String cadenaCaracteres = "asdfgh123456789 \"	''-+°!#$%&/()=?¡*";
		System.out.println(cadenaCaracteres);
		
		//definir un String
		String cadena = new String("Alkemy");
		System.out.println(cadena);
		
		//concatenación: juntar cadenas
		String nombre = "Mijail";
		String apellido = "Palma";
		String nombreCompleto = nombre + " " + apellido;
		System.out.println(nombreCompleto);
		System.out.println(nombre+ " " + apellido);
		
		Integer edad = 3;
		
		String nombreEdad= nombre + edad;// String + Numero => String
		System.out.println(nombreEdad);
		System.out.println(nombre + edad);
		// de izquierda a derecha
		System.out.println(3+4+"siete");//7siete
		System.out.println("siete"+3+4);//siete34
		//uso de parentesis
		System.out.println("siete"+(3+4));//siete7
		
		//funcion CONCAT
		String saludo = "Hola ".concat(nombreCompleto);
		System.out.println(saludo);//Hola Mijail Palma
		System.out.println("Hola".concat(" ").concat(nombre).concat(" ").concat(apellido));
	
		//funcion Length()
		int cantCaracteresNombre = nombre.length();
		System.out.println("cantidad de caracteres del nombre: "+cantCaracteresNombre);
		System.out.println("cantidad de caracteres del apellido: "+apellido.length());
		
		String password = "Admin1234";//4321nimdA //recursividad
		
		if(password.length()< 8) {
			System.err.println("Contraseña muy debil");
		}
		//recorrer un String
		for (int i = 0; i < password.length(); i++) {
			char caracter = password.charAt(i);
			System.out.println(caracter);
		}
		
		//Comparar String Equals
		
		//if(nombre == "Israel") {
		if(nombre.equals("Israel")) {
			System.out.println("Hasta luego "+ nombre);
		}else {
			System.out.println("Hola "+ nombre);
		}
		//ejemplo
		String x = "hola";
		String y = "Hola";
		
		System.out.println(x.equals(y));//
		System.out.println(x==y);//no confiarse
		System.out.println(y.equalsIgnoreCase(x));
		
		//Subcadenas
		System.out.println("*** subcadenas ***");
		System.out.println(nombreCompleto);//Mijail Palma
		System.out.println(nombreCompleto.substring(2));//jail Palma
		System.out.println(nombreCompleto.substring(7));//Palma
		System.out.println(nombreCompleto.substring(2, 9));//jail Pa
		
		//Buscar en String
		System.out.println(nombreCompleto.contains("Palma"));//true
		System.out.println(nombreCompleto.contains("Parra"));//false
		
		nombreCompleto = nombreCompleto + " Loren";
		System.out.println(nombreCompleto);
		
		System.out.println(nombreCompleto.startsWith("Mij"));//true
		System.out.println(nombreCompleto.endsWith("ren")); //true
		System.out.println(nombreCompleto.indexOf(" "));//6
		System.out.println(nombreCompleto.substring(0, 6));
		
		System.out.println(nombreCompleto.substring(7).indexOf(" "));
		String correo = "admin@alkemy.com";
		System.out.println(correo.indexOf("@"));//5
		System.out.println(correo.indexOf("$"));//-1 cuando no lo encuentra
		
		//quitar espacios al inicio y al final funcion trim()
		String mensaje = " Esto es un mensaje de prueba ";
		System.out.println(mensaje.trim());//
		
		//dividir String split("caracter")=> retorna un array String[]
		String[] palabras = mensaje.trim().split(" ");
		System.out.println(Arrays.toString(palabras));
		
		System.out.println(Arrays.toString(correo.trim().split("@")));
		
	}

}
