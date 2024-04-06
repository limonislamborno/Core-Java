
package phone;

public class Mobile implements AllMethod{
    
    private  String Screen;
    private  String button;
    private  String camera;
    private  String message;
    private  String call;

    public Mobile() {
    }

    public Mobile(String Screen, String button, String camera, String message, String call) {
        this.Screen = Screen;
        this.button = button;
        this.camera = camera;
        this.message = message;
        this.call = call;
    }

    public String getScreen() {
        return Screen;
    }

    public void setScreen(String Screen) {
        this.Screen = Screen;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    
    public void printDetails(){
        System.out.println(Screen+" "+ button+ " "+call+
                " "+message+" "+camera);
    }
}
