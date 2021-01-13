
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;


public class Controller {
    public TextField delay;
    public ChoiceBox summoner1;
    public ChoiceBox summoner2;

    public ChoiceBox summoner4;



    public void init() {
    }

    public void updateDelay(KeyEvent keyEvent) {
        System.out.println(delay.getText());
    }
}
