
package phone;


public class AndroidPhone extends Mobile{
    
    private String store;
    private String os;

    public AndroidPhone() {
    }

    public AndroidPhone(String store, String os) {
        this.store = store;
        this.os = os;
    }

    public AndroidPhone(String store, String os, String Screen, String button, String camera, String message, String call) {
        super(Screen, button, camera, message, call);
        this.store = store;
        this.os = os;
    }

  
    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    
    
    public void printDet(){
    
        System.out.println(
                super.getCall()+" "
                +super.getMessage()+" "+
                os+" "
                +store
        );
    }   
    
    
    
}
