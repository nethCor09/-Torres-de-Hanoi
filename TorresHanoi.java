public class TorresHanoi {
    public String  moverTorresHanoi(int nivel) {
        return moverTorresHanoi(nivel,'A','B','C');
    }
    
    private String moverTorresHanoi(int nivel, char origen, char aux, char destino){
        String res;
        
        if(nivel == 1) {
            res = reporte(nivel, origen, destino);
        }else {
            res = moverTorresHanoi(nivel-1, origen, destino, aux);
            res += reporte(nivel, origen, destino) + moverTorresHanoi(nivel-1, aux, origen, destino);
        }
        
        return res;
    }
    
    private String reporte(int nivel, char origen, char destino){
        return "El disco "+ nivel +" se movio de torre "+ origen +", se puso en la torre "+ destino + "\n";
    }
}
