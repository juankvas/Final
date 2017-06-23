package jc.electiva.afinal.util;

import java.util.ArrayList;
import java.util.List;

import jc.electiva.afinal.models.Compra;


public class data {

    private static List<Compra> compras;
    public static List<Compra> getCompras(){
        if(compras ==  null){
            compras =  new ArrayList<>();

            Compra p1 = new Compra();
            p1.setNombre("Martillo");
            p1.setImagen("http://suip.tramontina.com.br/public/upload/product/40203008/big40203008PDM001B.jpg");
            p1.setPrecio("5000");
            p1.setPromoc("Carrefour: 4x $17000 || Olimpica: Por la compra de mas de 3 martillos lleve gratis set de tornillos || Exito: 10x $45000");

            Compra p2 = new Compra();
            p2.setNombre("Taladro");
            p2.setImagen("https://www.hendel.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/1/0/102295_4.jpg");
            p2.setPrecio("120000");
            p2.setPromoc("Olimpica: Por la compra de mas de 4 taladros participe en un rifa de un carro || Exito: Pague 2 y lleve 3");

            Compra p3 = new Compra();
            p3.setNombre("Cemento x 1bulto");
            p3.setImagen("http://ingenieriadeandalucia.es/wp-content/uploads/2017/03/cemento.jpg");
            p3.setPrecio("30000");
            p3.setPromoc("Carrefour: 3 bultos x $70000 ||  Exito: Por la compra de mas de 5 bultos lleve gratis pala de acero inoxidable");

            Compra p4 = new Compra();
            p4.setNombre("Cincel");
            p4.setImagen("http://www.leroymerlin.es/img/r25/55/5502/550225/10288075/10288075_z1.jpg");
            p4.setPrecio("2000");
            p4.setPromoc("Carrefour: 10x $15000 || Olimpica: 20x $36000 ");

            Compra p5 = new Compra();
            p5.setNombre("Brocha");
            p5.setImagen("https://4.bp.blogspot.com/-VmsFmZbhjqQ/V3WfVpsB6lI/AAAAAAAAAXc/U9r4xgdXHR4rLt2q_1b_c_Ag-FK_85u4gCLcB/s1600/brocha%2B14483%2Btruper.jpg");
            p5.setPrecio("3500");
            p5.setPromoc("Carrefour: Por la compra de una brocha marca Black n Decker participe en el sorte de un taladro con juego de brocas");

            compras.add(p1);
            compras.add(p2);
            compras.add(p3);
            compras.add(p4);
            compras.add(p5);

        }

        return  compras;
    }

}