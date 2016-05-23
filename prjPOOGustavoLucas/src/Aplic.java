import fatec.poo.model.*;

public class Aplic {

    public static void main(String[] args) {
    Cliente cli1 = new Cliente("14495124851", "Gustavo Cruz", 2500.00);
    Cliente cli2 = new Cliente("14495124844", "Lucas Rios", 2000.00);
    Vendedor vend1 = new Vendedor("123", "Dimas", 800.00);
    Vendedor vend2 = new Vendedor("1234", "Levi", 1800.00);
    Produto prod1 = new Produto(1, "Bolacha");
    Produto prod2 = new Produto(2, "Salgadinho");
    Produto prod3 = new Produto(3, "Chocolate");
    Produto prod4 = new Produto(1, "Banana");
    ItemPedido item1 = new ItemPedido(1);
    item1.setProduto(prod4);
    item1.setQtdeVendida(3);
    
    ItemPedido item2 = new ItemPedido(2);
    item2.setProduto(prod1);
    item2.setQtdeVendida(3);
    
//criando pedido
    Pedido ped1 = new Pedido(1, "22/05/2016");
   

    ped1.setCliente(cli1);
    ped1.addItemPedido(item1);
    ped1.setVendedor(vend1);
    ped1.setDataPagto("30/05/2016");
   //item1.setPedido(ped1);
   ped1.addItemPedido(item1);
   ped1.addItemPedido(item2);
  // item2.setPedido(ped1);
   
   
   System.out.println("Pedido: " + ped1.getNumero() + "\nData: " + 
           ped1.getDataEmissaoPedido() + "\nVendedor: " + ped1.getVendedor() +
           "\nCliente: " + ped1.getCliente());
}
    
}
