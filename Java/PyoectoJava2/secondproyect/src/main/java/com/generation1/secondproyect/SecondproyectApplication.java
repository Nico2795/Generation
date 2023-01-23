package com.generation1.secondproyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondproyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondproyectApplication.class, args);
		//Crear un objeto vacio
		Pc pcDefault = new Pc();
		//Crear el objeto completo
		Pc pcCompleto = new Pc("Grande", "Disco solido SSD 1tb","Water Cooling Thermaltake", "36 gb RAM");
		//Se le dan los atributos al objeto vacio mediante set
		pcDefault.setTamaño("Slim");
		pcDefault.setTipoDisco("Disco duro 2tb");
		pcDefault.setRefrigeracion("Ventiladores");
		pcDefault.setMemoria("8gb de RAM ddr3");
		//Se modifica el objeto completo mediante el set
		pcCompleto.setMemoria("Tengo solo 2 gb de RAM :c");
		pcCompleto.setRefrigeracion("Me enfrio con 5 ventiladores y un ventilador externo");

		//Se crean las variables llamando al aributo que uno quiere mediante el .get

		String tamañoPcDefault = pcDefault.getTamaño();
		String memoriaPcCompleto = pcCompleto.getMemoria();
		String refrigeracionPcDefault = pcDefault.getRefrigeracion();
		String refrigeracionPcCompleto = pcCompleto.getRefrigeracion();
		//Se imprimen uno a uno el pc default, completo, laas variables, y por ultimo la accion o fncion que hace el pc
		System.out.println(pcDefault.toString());
		System.out.println(pcCompleto.toString());
		System.out.println(tamañoPcDefault); // Slim
		System.out.println(memoriaPcCompleto); // 2 gb de ram
		System.out.println(refrigeracionPcDefault); 
		System.out.println(refrigeracionPcCompleto); 
		System.out.println(pcCompleto.programar("java"));
	}

}
