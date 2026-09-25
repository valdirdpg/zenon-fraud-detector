package br.com.zenon.fraud;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static java.lang.IO.println;

public class TransactionIngestor {


    int contador = 0;


    public List<Transaction> transaction(String caminho) {
        try {
            Path path = Path.of(caminho);
            String file = Files.readString(path);
            String[] linhas = file.split("\n");
            String[] colunas;
            List<Transaction> transacao = new ArrayList<>();

            int x = 0;
            while ( x <= 1000) {
                this.contador = x++;
                colunas = linhas[x].split(",");
                Tipo tipo = Tipo.valueOf(colunas[1]);
                transacao.add(new Transaction(
                        Integer.parseInt(colunas[0]),
                        tipo,
                        Double.parseDouble(colunas[2]),
                        colunas[3],
                        Double.parseDouble(colunas[4]),
                        Double.parseDouble(colunas[5]),
                        colunas[6],
                        Double.parseDouble(colunas[7]),
                        Double.parseDouble(colunas[8]),
                        Boolean.parseBoolean(colunas[9]),
                        Boolean.parseBoolean(colunas[10])
                ));

            }

            return transacao;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getContador() {
        return contador;
    }
}
