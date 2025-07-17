package br.com.alura;

import br.com.alura.client.ClienteHttpConfiguration;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class ListarAbrigoCommand implements Command {


    @Override
    public void execute() {

        try {
            ClienteHttpConfiguration client = new ClienteHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.listarAbrigo();
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
