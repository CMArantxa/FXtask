package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label lblMensaje;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtPassword;
    public void onLoginAction(ActionEvent actionEvent){
       if (txtUsuario.getText().equals ("admin") & txtPassword.getText().equals("1234")){
           FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("user-main-view.fxml"));
           try {
               Parent root=fxmlLoader.load();
               UserController userController=fxmlLoader.getController();
               //userController.datos="Datos cargados desde loginController";
               Scene scene=new Scene(root);
               Stage stage=new Stage();
               stage.setTitle("Gestion usuario");
               stage.setScene(scene);
               stage.show();
               Node source = (Node) actionEvent.getSource();
               Stage stage1 = (Stage) source.getScene().getWindow();
               stage1.close();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }else{
           lblMensaje.setText ("Usuario o contraseña incorrecta");
       }
    }
}
