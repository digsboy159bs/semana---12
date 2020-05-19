public class Boleto extends Pagamento{
    private String numeroBoleto;
    private int dia, mes, ano;
    
    public Boleto(){
      super();
       numeroBoleto = "112311";
       dia = 12;
       mes = 12;
       ano = 2020;
   }
   
    public Boleto(String bo, int d, int m, int a , String n, String c, double v){
      super(n, c, v);
      setNumeroCheque(nb);
   }
   
   public String getNumeroBoleto(){
      return numeroBoleto;
   }
   
   public int getDia(){
      return dia;
   }

   public int getMes(){
      return mes;
   }
   
   public int getAno(){
      return ano;
   }
   
   public void setNumeroBoleto(String nb){
      numeroBoleto = nb;
   }

   
   public void setDia(int d){
      dia = d;
   }
   
   public void setMes(int m){
      mes = m;
   }
   
    public void setAno(int a){
      ano = a;
   }


}