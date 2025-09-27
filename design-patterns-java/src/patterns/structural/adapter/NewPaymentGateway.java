package patterns.structural.adapter;

interface NewPaymentGateway {
    void pay(String account, double amount);
}
