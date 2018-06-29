package p12facade.Computer;


public class Memory {

    public void load(Integer bootAddress, byte[] read){
        System.out.println(String.format("Loading \"%s\" at position %d", new String(read), bootAddress));

    }

    public void unload() {
        System.out.println("memory dump");
    }
}
