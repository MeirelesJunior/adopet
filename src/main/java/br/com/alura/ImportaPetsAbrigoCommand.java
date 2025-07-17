package br.com.alura;

import br.com.alura.client.ClienteHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportaPetsAbrigoCommand implements Command{
    @Override
    public void execute() {

        try {

            ClienteHttpConfiguration client = new ClienteHttpConfiguration();
            PetService petService = new PetService(client);

            petService.importarPetsAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
