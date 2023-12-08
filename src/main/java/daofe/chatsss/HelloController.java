package daofe.chatsss;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class HelloController {

  @FXML
  private Label welcomeText;
  @FXML
  private ImageView sendButton;
  @FXML
  private VBox phoneScreen;
  @FXML
  private TextField messageField;

  public void sendMessage() {


    // Create a Label
    Label label = new Label(messageField.getText());
    HBox tempHBox = new HBox();
    tempHBox.getChildren().add(label);
    HBox.setMargin(label, new Insets(2.5));
    tempHBox.setAlignment(Pos.BASELINE_RIGHT);

    label.setFont(new Font("System", 16));
    label.setStyle(""
        + "-fx-background-color:  #933234;"
        + "-fx-background-radius: 20;"
        + "-fx-padding: 12;"
        + "-fx-margin: 5;"
    );
    label.setWrapText(true);
    label.setMaxWidth(300);
    label.setTextFill(Color.WHITE);
    // Create a answer Label
    Label answerLabel = new Label("\uD83D\uDE00 oki cậu");
    HBox answerHBox = new HBox();
    answerHBox.getChildren().add(answerLabel);
    HBox.setMargin(answerLabel, new Insets(2.5));
    tempHBox.setAlignment(Pos.BASELINE_RIGHT);

    answerLabel.setFont(new Font("System", 16));
    answerLabel.setStyle(""
        + "-fx-background-color:  #AD8A77;"
        + "-fx-background-radius: 20;"
        + "-fx-padding: 12;"
        + "-fx-margin: 5;"
    );
    answerLabel.setWrapText(true);
    answerLabel.setMaxWidth(300);
    answerLabel.setTextFill(Color.WHITE);
    // Add the Label to the AnchorPane
    phoneScreen.getChildren().add(tempHBox);
    phoneScreen.getChildren().add(answerHBox);


  }

  public void sendMessageEnter(KeyEvent k) {
    if (k.getCode() == KeyCode.ENTER) {
      sendMessage();
    }
  }


  @FXML
  protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
  }
}