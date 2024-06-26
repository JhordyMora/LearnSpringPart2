package com.mora.spring2;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mora.models.domain.ItemFactura;
import com.mora.models.domain.Producto;
import com.mora.models.services.IService;
import com.mora.models.services.MiServicioMedio;

@Configuration
public class AppConfig {
    @Bean("miServicioMedio")
    public IService llamarServicio() {
        return new MiServicioMedio();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems() {
        Producto producto1 = new Producto("Cámara Sony", 100);
        Producto producto2 = new Producto("Bicicleta Bianca aro 26", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);
        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina() {
        Producto producto1 = new Producto("Monitor LG LCD 24", 250);
        Producto producto2 = new Producto("Notebook Ases", 500);
        Producto producto3 = new Producto("Impresora Multifunctional HP", 80);
        Producto producto4 = new Producto("Escritorio Oficina", 300);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 1);
        ItemFactura linea3 = new ItemFactura(producto3, 1);
        ItemFactura linea4 = new ItemFactura(producto4, 1);
        return Arrays.asList(linea1, linea2, linea3, linea4);
    }
}
