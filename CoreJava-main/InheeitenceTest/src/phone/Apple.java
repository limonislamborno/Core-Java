
package phone;


public class Apple extends AndroidPhone{
    
    private  String faceTime;
    private  String IMessage;

    public Apple() {
    }

    public Apple(String faceTime, String IMessage) {
        this.faceTime = faceTime;
        this.IMessage = IMessage;
    }

    public Apple(String faceTime, String IMessage, String store, String os) {
        super(store, os);
        this.faceTime = faceTime;
        this.IMessage = IMessage;
    }

    public Apple(String faceTime, String IMessage, String store, String os, String Screen, String button, String camera, String message, String call) {
        super(store, os, Screen, button, camera, message, call);
        this.faceTime = faceTime;
        this.IMessage = IMessage;
    }

    
    
    public String getFaceTime() {
        return faceTime;
    }

    public void setFaceTime(String faceTime) {
        this.faceTime = faceTime;
    }

    public String getIMessage() {
        return IMessage;
    }

    public void setIMessage(String IMessage) {
        this.IMessage = IMessage;
    }
    
    
    
    
}
