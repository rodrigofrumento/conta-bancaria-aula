package conta.banco;

import java.util.Scanner;

class Conta{
    int numero;
    String titular;
    double saldo;
    double salario;
    
    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    void deposita(double quantidade){
        this.saldo += quantidade;
    }
}

class ContaBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        Conta minhaConta;
        minhaConta = new Conta();
        
        minhaConta.titular = nome;
        minhaConta.saldo = 1000.0;
        
        //saque de 300 reais
        System.out.println("Quanto quer sacar? ");
        int saque = input.nextInt();
        minhaConta.saca(saque);
        
        //deposito de 200 reais
        //minhaConta.deposita(200);
        
        System.out.println("Olá " + minhaConta.titular + " bem vindo de volta");
        System.out.println("Saldo Atual: " + minhaConta.saldo);
    }  
}
