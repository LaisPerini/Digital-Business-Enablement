package br.com.fiap.loja.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.loja.bean.Camisa;

public class CamisaDAO {
	private final static List<Camisa> CAMISAS = new ArrayList<Camisa>();
	
	
	static {
		CAMISAS.add(new Camisa(401, 90.0, 20, "Camisa Branca"));
		CAMISAS.add(new Camisa(402, 70.0, 30, "Camisa Azul"));
		CAMISAS.add(new Camisa(403, 100.0, 50, "Camisa Rosa"));
		
	
	
	//public Camisa consultarProduto(int codProduto){
	//	if(codProduto == 401) {
	//		return codigo;
	//	} else if (codProduto == 402){
	// CAMISAS;
	//	} else if (codProduto == 403) {
	//		return CAMISAS;
	//	} else {
			//return CAMISAS;
	//	}
	}

}
