package com.sd.locacao;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {

           LocacaoImpl locacaoService = new LocacaoImpl();


           Registry registry = LocateRegistry.createRegistry(1082);

           registry.rebind("LocacaoService", locacaoService);

            System.out.println("Servidor RMI pronto!");
        } catch (Exception e) {
            System.err.println("Erro no servidor RMI:");
            e.printStackTrace();
        }
    }
}