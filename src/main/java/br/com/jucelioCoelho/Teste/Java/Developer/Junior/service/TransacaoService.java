package br.com.jucelioCoelho.Teste.Java.Developer.Junior.service;

import br.com.jucelioCoelho.Teste.Java.Developer.Junior.model.Empresa;
import br.com.jucelioCoelho.Teste.Java.Developer.Junior.model.SaldoInsuficienteException;
import br.com.jucelioCoelho.Teste.Java.Developer.Junior.model.Taxa;
import br.com.jucelioCoelho.Teste.Java.Developer.Junior.repository.EmpresaRepository;
import br.com.jucelioCoelho.Teste.Java.Developer.Junior.repository.TaxaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {
    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private TaxaRepository taxaRepository;

    public void realizarTransacao(Empresa empresa, double valor) {
        // Verificar se há saldo suficiente na empresa
        double saldoDisponivel = empresa.getSaldo();
        for (Taxa taxa : empresa.getTaxas()) {
            saldoDisponivel -= taxa.getValor();
        }

        if (saldoDisponivel >= valor) {
            // Atualizar o saldo da empresa
            empresa.setSaldo(saldoDisponivel - valor);
            empresaRepository.save(empresa);

            // Enviar callback para a empresa (simulação)
            enviarCallbackParaEmpresa(empresa);

            // Enviar notificação para o cliente (simulação)
            enviarNotificacaoParaCliente();
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente na empresa.");
        }
    }

    private void enviarCallbackParaEmpresa(Empresa empresa) {
        // Lógica para enviar callback para a empresa (simulação)
        // Utilize um serviço de webhook como webhook.site para simular o envio de callback
        // Exemplo: restTemplate.postForObject(empresa.getCallbackUrl(), ...);
    }

    private void enviarNotificacaoParaCliente() {
        // Lógica para enviar notificação para o cliente (simulação)
        // Exemplo: enviar e-mail, SMS, etc.
    }
}
