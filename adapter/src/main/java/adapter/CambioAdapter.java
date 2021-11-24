package adapter;

public class CambioAdapter extends MoedaDolar{

    //convertendo

    private IMoeda moedaBitcoin;

    public CambioAdapter (IMoeda moedaBitcoin){
        this.moedaBitcoin = moedaBitcoin;
    }

    public String pegarMoeda() {
        if (this.getDolar() == 318000)
            moedaBitcoin.setMoeda("1");
        else
            if (this.getDolar() < 318000)
                moedaBitcoin.setMoeda("0");
        return moedaBitcoin.getMoeda();
    }

    public void salvarMoeda() {
        if (moedaBitcoin.getMoeda().equals("1"))
            this.setDolar(318000);
        else
            this.setDolar(0);
    }
}
