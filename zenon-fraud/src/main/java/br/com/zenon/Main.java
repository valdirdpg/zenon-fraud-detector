package br.com.zenon;
import br.com.zenon.fraud.Tipo;
import br.com.zenon.fraud.Transaction;

import static java.lang.IO.println;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Transaction t1 = new Transaction(1, Tipo.PAYMENT,9839.64,"C1231006815",
                170136.0,160296.36,"M1979787155",0.0,
                0.0,false,false);
        println(t1);

        Transaction t2 = new Transaction(743, Tipo.CASH_OUT,850002.52,"C1280323807",
                850002.52,0.0,"C873221189",6510099.11,
                7360101.63,true,false);
        System.out.println("====================Nova Transação======================");
        println(t2);
    }
}
