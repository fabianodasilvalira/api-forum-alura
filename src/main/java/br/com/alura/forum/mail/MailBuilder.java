package br.com.alura.forum.mail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailBuilder {
	
	@Value("${spring.mail.username}")
    private String emailOrigem;
    

    
    @Autowired
    private JavaMailSender sender;
    
    public void sendSimpleMail(String destinatario,String assunto,String conteudo){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailOrigem);
        message.setTo(destinatario);
        message.setSubject(assunto);
        message.setText(conteudo);
        sender.send(message);
    }

}
