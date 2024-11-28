package ca.georgiancollege.comp1008fall2024thursdaysgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {


    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    private void example1(){

        System.out.println("Login Clicked");

        System.out.println(txtEmail.getText());
        System.out.println(txtPassword.getText());


        String email = txtEmail.getText();
        String password = txtPassword.getText();

        if(
                email.equals("admin") && password.equals("password")
                        ||
                        email.equals("firstname") && password.equals("lastname")
                        ||
                        email.equals("hello") && password.equals("world")
        ){
            System.out.println("Correct credentials ");
        }
        else{
            System.out.println("Incorrect credentials ");
        }


    }

    private LoginModel model = new LoginModel();

    @FXML
    void onLoginClick(ActionEvent event){

    }

    @FXML
    void onRegisterClick(ActionEvent event){
        //System.out.println("Register Clicked");
        try {
            model.registerUser(txtEmail.getText(), txtPassword.getText());
        }
        catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Registration Error");
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}
