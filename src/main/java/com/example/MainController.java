/*
* File: MainController.java
* Author: Hosszú Tamás
* Copyright: 2024, Hosszú Tamás
* Group: II-1-N
* Date: 2024-11-12
* Github: https://github.com/HosszuTamas
* Licenc: GNU GPL
*/
package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField areaField;

    @FXML
    private TextField asideField;

    @FXML
    private TextField bsideField;

    @FXML
    private TextField csideField;

    @FXML
    private TextField dsideField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    private void startCalc() {
        String asideStr=asideField.getText();
        String bsideStr=bsideField.getText();
        String csideStr=csideField.getText();
        String dsideStr=dsideField.getText();

        double a=Double.parseDouble(asideStr);
        double b=Double.parseDouble(bsideStr);
        double c=Double.parseDouble(csideStr);
        double d=Double.parseDouble(dsideStr);

        double area=calcArea(a,b,c,d);
        areaField.setText(String.valueOf(area));
    }

    private double calcArea(double a,double b,double c,double d) {
        double area=((a+c)/(4*(a-c)))*Math.sqrt(((a+b-c+d)*(a-b-c+d)*(a+b-c-d)*(-a+b+c+d)));
        return area;
    }

    
    @FXML
    void onClickAboutButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Névjegy");
        alert.setHeaderText("trapter");
        alert.setContentText("Hosszú Tamás\nII-1-N\n2024-11-12");
        alert.showAndWait();
    }
    
}
