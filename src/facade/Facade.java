package facade;

public class Facade {
    public void migrarCliente (String nome,String cep){
       String cidade = CepApi.getIntancia().recuperarCidade(cep);
       String estado = CepApi.getIntancia().recuperarCidade(cep);
      
      
      CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
