import javax.print.event.PrintJobListener;

public class PrincipalImovel {

    public static void main(String[] args) {
        
        Novo n =  new Novo();
        n.setEndereco("Rua Quintino Bocaiuva, Pompéia");;
        n.setPreco(50000);
        n.setProcoAdicional(500);
        System.out.println("Endereço: " +n.getEndereco()+" Preço: "+n.getPreco()+" Preço Adioconal: "+n.getProcoAdicional());

        Velho v = new Velho();
        v.setEndereco("Rua Epaminondas de Toledo Pissa, Pompéia");
        v.setPreco(100000);
        v.setDescontoPreco(5000);
        System.out.println("Endereço: " +v.getEndereco()+" Preço: "+v.getPreco()+" Desconto: "+v.getDescontoPreco());
    }
    
}
