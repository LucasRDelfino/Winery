package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        // Exemplo simples
        return "Menu de Vinhos: Cabernet Sauvignon, Merlot, Chardonnay";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        // Exemplo simples
        return "Pedido recebido: " + quantity + " garrafas de " + name;
    }

}
