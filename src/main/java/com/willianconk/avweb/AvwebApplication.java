package com.willianconk.avweb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.willianconk.avweb.domain.Cardapio;
import com.willianconk.avweb.domain.Usuario;
import com.willianconk.avweb.repositories.CardapioRepository;
import com.willianconk.avweb.repositories.UsuarioRepository;

@SpringBootApplication
public class AvwebApplication implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private CardapioRepository cardapioRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AvwebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario us1 = new Usuario(null, true, "jose", "1234");
		Usuario us2 = new Usuario(null, false, "joanio", "56789");
		
		Cardapio car1 = new Cardapio(null, "pizzadog", "dog", "pizza", "gelatina", "coca zero");
		Cardapio car2 = new Cardapio(null, "iracema", "dog", "xtudo", "sorvete", "pepsi");
		
		us1.getCardapio().addAll(Arrays.asList(car1));
		us2.getCardapio().addAll(Arrays.asList(car2));
		
		car1.getUsuarios().addAll(Arrays.asList(us1));
		car2.getUsuarios().addAll(Arrays.asList(us2));
		
		
		
		usuarioRepository.saveAll(Arrays.asList(us1, us2));
		cardapioRepository.saveAll(Arrays.asList(car1, car2));
	}

}
