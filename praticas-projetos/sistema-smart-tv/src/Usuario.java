public class Usuario {
public static void main(String[] args) {
  
    //cria um novo objeto a partir da classe SmartTv, com seus atributos e métodos
    SmartTv smartTv = new SmartTv();


  smartTv.ligarTv();
  smartTv.mudarCanal(5);
  smartTv.diminuirVolume();

  System.out.println(smartTv.tvLigada);
  System.out.println(smartTv.canal);
  System.out.println(smartTv.volume);
}
}
