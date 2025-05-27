package chain_of_responsibility.B16;

public abstract class AHandler {
    protected AHandler nextHandler;

    public AHandler getNextHandler(){
        return this.nextHandler;
    }

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void notifica(Client client, String mesaj);
}
