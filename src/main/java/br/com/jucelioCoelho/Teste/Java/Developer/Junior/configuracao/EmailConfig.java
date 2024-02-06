package br.com.jucelioCoelho.Teste.Java.Developer.Junior.configuracao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailConfig {

    @Autowired
    private JavaMailSender javaMailSender;

    public void enviarEmail(String destinatario, String assunto, String corpo) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        try {
            helper.setTo(destinatario);
            helper.setSubject(assunto);
            helper.setText(corpo);
            javaMailSender.send(message);
            System.out.println("E-mail enviado com sucesso para: " + destinatario);
        } catch (MessagingException e) {
            System.out.println("Erro ao enviar e-mail para: " + destinatario);
            e.printStackTrace();
        }
    }
}
