package pac10;

public class Radio implements Power,Volume{
    private boolean power;
    private int volume = 3;
    private int MINVOLUME = 0 ;
    private int MAXVOLUME = 5;

    public Radio(){
        this.power = false;
    }
    @Override
    public boolean isPower(){
        return this.power;
    }
    @Override
    public void powerOn(){
        this.power = true ;
    }
    @Override
    public void powerOff(){
        this.power = false ;
    }
    @Override
    public int getVolume(){
        return volume;
    }

    @Override
    public void upVolume(){
        if(volume < 5) {

            volume++;
        }
    }

    @Override
    public void downVolume(){
        if(volume > 0){
            volume--;
        }

    }
}
