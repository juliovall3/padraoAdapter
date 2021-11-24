package adapter;

public class BancoCripto {

    IMoeda moeda;
    CambioAdapter persistencia;

    public BancoCripto(){
        moeda = new MoedaBitcoin();
        persistencia = new CambioAdapter(moeda);
    }

    public void setMoeda(String bitcoin){
        moeda.setMoeda(bitcoin);
        persistencia.salvarMoeda();
    }

    public String getMoeda(){
        return persistencia.pegarMoeda();
    }

    public float getDolar(){
        return persistencia.getDolar();
    }
}
