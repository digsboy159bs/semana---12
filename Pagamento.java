public class Pagamento{
   private String nomeDoPagador;
   private String cpf;
   private double valorASerPago;
   
   public Pagamento(String n, String c, double v){
      nomeDoPagador = n;
      cpf = c;
      valorASerPago = v;
   }
   
   public String getNomeDoPagador(){
      return nomeDoPagador;
   }
   
    public String getCpf(){
      return cpf;
   }
   
    public double getValorASerPago(){
      return valorASerPago;
   }
   
   public void setNomeDoPagador(String n){
      nomeDoPagador = n;
   }
   
   public void setCpf(String c){
      cpf = c;
   }
   
   public void setNomeDoPagador(double v){
      valorASerPago = v;
   }

}