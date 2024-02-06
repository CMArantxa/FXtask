package com.example.demo;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.text.SimpleDateFormat;
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
    protected TableColumn<Task,String> title;
    @FXML
    protected TableColumn <Task,String>description;
    @FXML
    protected TableColumn<Task,String > creation;
    @FXML
    protected TableColumn <Task,String>dead;
    @FXML
    protected TableColumn <Task,String>status;
@FXML
protected TextField txttitle;
@FXML
protected TextField txtdescrip;
@FXML
protected TextField txtcreation;
@FXML
protected TextField txtdead;
@FXML
protected TextField txtstatus;
    private ObservableList<Task> tasks;
    @FXML
    protected void risas() {
        System.out.println(carapuchiña.getText());
        System.out.println(fecha.getValue());
    }

    @FXML
    protected void btntraerDatos() {
         tasks = FXCollections.observableArrayList(
                new Task("Inventario", "Inventariar almacen", "febrero", "febrero","pendiente"),
                new Task("Limpieza", "Limpiar almacen", "febrero","febrero" ,"pendiente")
        );

        title.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().title()));
        description.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().description()));
        creation.setCellValueFactory(cellData-> new SimpleStringProperty(cellData.getValue().creation()));
        dead.setCellValueFactory(cellData->  new SimpleStringProperty(cellData.getValue().dead()));
        status.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().status()));
        tbltask.setItems(tasks);
    }

    public void addDatos(ActionEvent actionEvent) {
    Task task=new Task(txttitle.getText(),txtdescrip.getText(),txtcreation.getText(),txtdead.getText(),txtstatus.getText());
    tasks.addAll(task);
    txttitle.clear();
    txtdescrip.clear();
    txtcreation.clear();
    txtdead.clear();
    txtstatus.clear();
    tbltask.setItems(tasks);
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
    }*/

