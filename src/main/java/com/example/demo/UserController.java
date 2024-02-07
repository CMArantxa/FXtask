package com.example.demo;

import com.sun.javafx.UnmodifiableArrayList;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.Date;

public class UserController {
    @FXML
    public DatePicker fecha;
    @FXML
    protected Menu file;
    @FXML
    protected MenuItem mnCerrar;

    @FXML
    protected void close() {
        System.out.println("cerrar ventana");
    }

    @FXML
    protected TextField carapuchiña;
    @FXML
    protected Button button;
    @FXML
    protected TableView<Task> tbltask;
    @FXML
    protected TableColumn<Task, String> title;
    @FXML
    protected TableColumn<Task, String> description;
    @FXML
    protected TableColumn<Task, LocalDate> creation;
    @FXML
    protected TableColumn<Task, LocalDate> dead;
    @FXML
    protected TableColumn<Task, String> status;
    @FXML
    protected TextField txttitle;
    @FXML
    protected TextField txtdescrip;
    @FXML
    protected DatePicker dateCreation;
    @FXML
    protected DatePicker dateDead;
    @FXML
    protected TextField txtstatus;
    private ObservableList<Task> tasks=FXCollections.observableArrayList();

    @FXML
    protected void risas() {
        System.out.println(carapuchiña.getText());
        System.out.println(fecha.getValue());
    }


    @FXML
    public void addDatos(ActionEvent actionEvent) {
        Task task = new Task(txttitle.getText(), txtdescrip.getText(), LocalDate.now() , dateDead.getValue(), false);
        tasks.addAll(task);
        txttitle.clear();
        txtdescrip.clear();
        dateCreation.setValue(null);
        dateDead.setValue(null);
        txtstatus.clear();
        tbltask.setItems(tasks);
    }

    @FXML
    public  void initialize(){
        title.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().title()));
        description.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().description()));

        creation.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getCreation()));

        dead.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().dead()));

        status.setCellValueFactory(cellData -> new SimpleBooleanProperty(cellData.getValue().status()).asString());

    }
}
   /* public String datos;
   /* public String datos;
    public void initialize(){
       menUser.setText;

    }
    private Menu menUser;


    }
    @FXML
    protected void mostrar(){
        System.out.println(datos);
    }
*/

