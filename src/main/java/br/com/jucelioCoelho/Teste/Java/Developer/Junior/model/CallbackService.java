package br.com.jucelioCoelho.Teste.Java.Developer.Junior.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallbackService {

    @Autowired
    private RestTemplate restTemplate;

    public void enviarCallbackParaEmpresa(Empresa empresa) {
        // Lógica para enviar callback para a empresa (simulação)
        String callbackUrl = empresa.getCallbackUrl();

        // Simulação do envio do callback
        if (callbackUrl != null && !callbackUrl.isEmpty()) {
            try {
                // Você pode ajustar os parâmetros conforme necessário
                restTemplate.postForObject(callbackUrl, empresa, String.class);
            } catch (Exception e) {
                // Lidar com possíveis exceções
                e.printStackTrace();
            }
        } else {
            System.out.println("Callback URL não definida para a empresa: " + empresa.getId());
        }
    }
}

