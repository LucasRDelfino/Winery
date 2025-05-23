package br.com.fiap.winery;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8085/WineStockService?wsdl");

            QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");

            Service service = Service.create(url, qName);

            WineStockService wineStockService = service.getPort(WineStockService.class);

            String wineName = "Merlot";
            int quantity = 3;

            String order = wineStockService.placeOrder(wineName, quantity);

            System.out.println(order);


            URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");
            QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");

            Service service2 = Service.create(url2, qName2);
            WineWarningService wineWarningService = service2.getPort(WineWarningService.class);

            String warn = wineWarningService.sendWarn();
            System.out.println(warn);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
