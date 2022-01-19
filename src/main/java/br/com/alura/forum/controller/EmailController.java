package br.com.alura.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.mail.MailBuilder;



@RestController
@RequestMapping("/enviarEmail")
public class EmailController {
	

	@Autowired
	private MailBuilder mailBuilder;
	
	
	@GetMapping
	public void enviarEmail(@RequestParam String destinatario, String assunto, String conteudo) {
		
		this.mailBuilder.sendSimpleMail( destinatario, assunto, conteudo);
		
		
		return;
		
		
	}

}
