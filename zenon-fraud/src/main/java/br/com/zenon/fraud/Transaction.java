package br.com.zenon.fraud;

public record Transaction(int step, Tipo type, double amount, String nameOrig,
                          double oldbalanceOrg,
                          double newbalanceOrig, String nameDest, double oldbalanceDest,
                          double newbalanceDest, boolean isFraud, boolean isFlaggedFraud) {

}
