package br.com.fiap.loja;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.fiap.loja.bo.EstoqueBO;
import br.com.fiap.singleton.PropertySingleton;

public class TerminalConsulta {
	public static void main(String[] args) {
		
	Scanner e = new Scanner(System.in);
	int codigo =0;
	String nome = PropertySingleton.getIntance().getProperty("nome");
	
	LocalDate hoje = LocalDate.now();
	DateTimeFormatter formatador = 
DateTimeFormatter.ofPattern(PropertySingleton.getIntance().getProperty("mascara"));
	hoje.format(formatador);

	System.out.println("Digite o código do produto: ");
	codigo = e.nextInt();
	

		String descricao;
		if(codigo==401){
			descricao="Camiseta Branca";
			System.out.println(descricao);
		} else if(codigo==402) {
			descricao="Camiseta Azul";
			System.out.println(descricao);
		} else if(codigo==403) {
			descricao="Camiseta Rosa";
			System.out.println(descricao);
		} else {
			System.out.println("Produto não encontrado");
		}
	
		
	System.out.println(nome + " " + "Data: " + hoje.format(formatador));
	ProdutoTO produto = EstoqueBO.consultarProduto(codigo);
    System.out.println (produto.getDescricao());
    e.close();
   
	}}
	

	
		
	
	
	
	

	
	
	
