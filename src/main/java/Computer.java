public class Computer {
    private int storage;
    private String model;
    private boolean printerConnected ;

    public Computer(int storage, String model){
        this.storage = storage;
        this.model = model ;
        this.printerConnected = false ;
    }

    public int getStorage() {
        return this.storage;
    }
    public void setStorage(int addStorage){
        this.storage = storage + addStorage;
    }
    public String getPrinterConnected() {
        if (printerConnected) {
            return "Epson";
        } else {
            return "no";
        }
    }
    public void setPrinterConnected(){
        this.printerConnected = true;
    }
    public String printMessage(){
        if(printerConnected){
            return "The printer is connected";
        }else{
            return "The printer is not connected";
        }
    }
}