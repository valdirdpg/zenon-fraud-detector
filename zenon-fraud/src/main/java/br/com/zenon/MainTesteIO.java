package br.com.zenon;

import br.com.zenon.fraud.TransactionIngestor;
import java.io.IOException;
import static java.lang.IO.println;

public class MainTesteIO {
    void main(String[] args) throws IOException {
        String caminho = "C://Users//valdi//Documents//VALDIR_CURSO_JAVA_UNIPDS//workspace//GIT//zenon-fraud-detector//zenon-fraud//src//main//data//PS_20174392719_1491204439457_log.csv";
        TransactionIngestor transactionIngestor = new TransactionIngestor();
        var t = transactionIngestor.transaction(caminho);
        t.forEach(transactions -> println(transactions));

        println("Quantidade de transações: " + transactionIngestor.getContador());

    }
}
