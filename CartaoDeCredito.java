public class CartaoDeCredito extends Pagamento{
   private String numeroCartao;
   
   public CartaoDeCredito(){
   super();
   numeroCartao = "787";
   }
   
   public CartaoDeCredito(String nu, String n, String c, double v){
      super(n, c, v);
      setNumeroCartao(nu);
   }
   
   public String getNumeroCartao(){
      return numeroCartao;
   }
   
   public void setNumeroCartao(String nu){
      numeroCartao = nu;
   }
}