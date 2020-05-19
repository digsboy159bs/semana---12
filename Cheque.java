public class Cheque extends Pagamento{
   private String numeroCheque;
  
   
   public Cheque(){
      super();
      numeroCheque = "11231312";
   }
   
    public Cheque(String ch , String n, String c, double v){
      super(n, c, v);
      setNumeroCheque(ch);
   }
   
   public String getNumeroCheque(){
      return numeroCheque;
   }
   
   public void setNumeroCheque(String ch){
      numeroCheque = ch;
   }
   
   

}