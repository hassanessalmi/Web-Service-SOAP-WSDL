package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class Client {
    public static void main(String[] args) {

        BanqueService stub =new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(3000));
        Compte cp=stub.getCompte(5);
        System.out.println(cp.getSolde()+"\n"+cp.getCode());



    }
}