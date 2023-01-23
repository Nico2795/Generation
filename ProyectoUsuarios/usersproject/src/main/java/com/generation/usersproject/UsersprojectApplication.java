package com.generation.usersproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.usersproject.models.Admin;
import com.generation.usersproject.models.Cajero;
import com.generation.usersproject.models.Cliente;
import com.generation.usersproject.models.EjecutivoEmpresa;
import com.generation.usersproject.models.EjecutivoPersona;

@SpringBootApplication
public class UsersprojectApplication {


	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		System.out.println(cliente);
		Cajero cajero = new Cajero();
		System.out.println(cajero);
		EjecutivoEmpresa ejecutivoEmpresa = new EjecutivoEmpresa();
		System.out.println(ejecutivoEmpresa);
		EjecutivoPersona ejecutivoPersona = new EjecutivoPersona();
		System.out.println(ejecutivoPersona);
		Admin admin = new Admin();
		System.out.println(admin);

		cliente.consultas();
		cliente.solicitudes();
		cajero.abrirCuenta();
		cajero.cerrarCuenta();
		ejecutivoEmpresa.abrirCuentaEmpresa();
		ejecutivoPersona.usoInternacional();
		ejecutivoPersona.seguroPersonal();
		admin.obtenerPrivilegios();

		Cliente clienteNuevo= new Cliente("Nico","olakeace",175,"nico123@gmail.com",559642485,true,"siempre viva 123",55555);

		System.out.println(clienteNuevo);
/* 		Cliente cliente2 = new Cliente("Nico","olakeace",175,"nico123@gmail.com",559642485,true,"siempre viva 123",55555);

		String cliente2Nombre = cliente2.getNombre();
		System.out.println(cliente2);
		System.out.println(cliente2Nombre);
	} */

		
		
}
}


