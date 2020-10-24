/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bth1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class FXMLController implements Initializable {

    @FXML private VBox vCtrls;
    @FXML private StackPane sp;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void themHandler(ActionEvent evt){
    TextField txt = new TextField();
    
    vCtrls.getChildren().add(txt);
    }
    
    public void veHandler(ActionEvent evt)
    {
        PieChart pc = new PieChart();
        pc.setTitle("Bieu do du lieu");
        for(Node n: vCtrls.getChildren()){
            TextField tf = (TextField) n;
            pc.getData().add(new PieChart.Data(tf.getText(),
                    Integer.parseInt(tf.getText())));
        }
        sp.getChildren().add(pc);
    }
}
