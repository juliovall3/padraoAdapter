package adapter;

public class MoedaBitcoin implements IMoeda{

    private String bitcoin;

    @Override
    public String getMoeda(){
        return this.bitcoin;
    }

    @Override
    public void setMoeda( String bitcoin){
        this.bitcoin = bitcoin;
    }
}
