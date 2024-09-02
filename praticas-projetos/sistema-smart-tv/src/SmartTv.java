public class SmartTv {

        boolean tvLigada = false;
        int canal = 1;
        int volume = 10;

        public void ligarTv() {
            tvLigada = true;
        }; 
    
        public void desligarTv() {
            tvLigada = false;
        };
    
        public void mudarCanal(int novoCanal) {
            canal = novoCanal;
        };

        public void aumentarVolume() {
            volume++;
        };

        public void diminuirVolume() {
            volume--;
        };

}

