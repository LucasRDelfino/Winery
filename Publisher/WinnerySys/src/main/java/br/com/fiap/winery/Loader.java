package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {

        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        String url = "http://localhost:8085/WineStockService";
        Endpoint.publish(url, wineStock);

        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();
        String urlWarning = "http://localhost:8086/WineWarningService";
        Endpoint.publish(urlWarning, wineWarning);

        System.out.println("Serviço publicado!");
    }
}