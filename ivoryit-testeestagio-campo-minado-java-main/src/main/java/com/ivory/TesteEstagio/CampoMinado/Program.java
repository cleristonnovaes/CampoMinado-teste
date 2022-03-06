package com.ivory.TesteEstagio.CampoMinado;

import java.util.Random;

public class Program {
	
	public void executar() {
		
		CampoMinado campoMinado = new CampoMinado();
		
		System.out.println("Início do jogo\n=======");
		System.out.println(campoMinado.Tabuleiro());
		
		// Realize sua codificação a partir deste ponto, boa sorte!
		Random rand = new Random();
		int jogada = 0;
		while(campoMinado.JogoStatus() == StatusTipo.Aberto) {
			
			int linha = rand.nextInt(8) + 1;
			int coluna = rand.nextInt(8) + 1;
			jogada++;
			System.out.println("Jogo: " + jogada);
			System.out.println("Jogada escolhida, linha " + linha + " e coluna " + coluna);
			
			campoMinado.Abrir(linha, coluna);
			
			System.out.println(campoMinado.Tabuleiro());
		}
		
		if(campoMinado.JogoStatus() == StatusTipo.GameOver) {
			System.out.println("Você perdeu!!!");
		}
		else if(campoMinado.JogoStatus() == StatusTipo.Vitoria) {
			System.out.println("Parabéns, você venceu!!!");
		}
	}

}
