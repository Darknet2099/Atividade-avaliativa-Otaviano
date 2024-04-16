public class fatura {
    private int numero, quantidade;
    private string descricao;
    private double preco, total;
  
    public fatura(int n, int q, string d, double p) {
      numero = n;
      quantidade = q;
      descricao = d;
      preco = p; 
      
      if(q < 0 && p < 0){
      q = 0;
      p = 0;
      }
    }
  //Eu não consegui solucionar o erro de compilação, o replit fala que tem um erro na linha 17, mas não sei o que é.
  public Iniciarfatura(int n, int q, string d, double p){
    numero = n;
    descricao = d;
    preco = p;
  }
  public void Setnumero(int n){
    numero = n;
  }
  public void Setquantidade(int q){
    quantidade = q;
  }
  public void Setdescricao(string d){
    descricao = d;
  }
  public void Setpreco(double p){
    preco = p;
  }
  public double calcular(double total){
  total = quantidade * preco;
    return(total);
  }

}