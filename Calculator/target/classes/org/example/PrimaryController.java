package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML // fx:id="aBtn"
    private Button aBtn; // Value injected by FXMLLoader

    @FXML // fx:id="bBtn"
    private Button bBtn; // Value injected by FXMLLoader

    @FXML // fx:id="cBtn"
    private Button cBtn; // Value injected by FXMLLoader

    @FXML // fx:id="clearBtn"
    private Button clearBtn; // Value injected by FXMLLoader

    @FXML // fx:id="dBtn"
    private Button dBtn; // Value injected by FXMLLoader

    @FXML // fx:id="divBtn"
    private Button divBtn; // Value injected by FXMLLoader

    @FXML // fx:id="eBtn"
    private Button eBtn; // Value injected by FXMLLoader

    @FXML // fx:id="eightBtn"
    private Button eightBtn; // Value injected by FXMLLoader

    @FXML // fx:id="fBtn"
    private Button fBtn; // Value injected by FXMLLoader

    @FXML // fx:id="fiveBtn"
    private Button fiveBtn; // Value injected by FXMLLoader

    @FXML // fx:id="fourBtn"
    private Button fourBtn; // Value injected by FXMLLoader

    @FXML // fx:id="mainTF"
    private TextField mainTF; // Value injected by FXMLLoader

    @FXML // fx:id="modeBtn"
    private Button modeBtn; // Value injected by FXMLLoader

    @FXML // fx:id="modeTF"
    private TextField modeTF; // Value injected by FXMLLoader

    @FXML // fx:id="mulBtn"
    private Button mulBtn; // Value injected by FXMLLoader

    @FXML // fx:id="nineBtn"
    private Button nineBtn; // Value injected by FXMLLoader

    @FXML // fx:id="oneBtn"
    private Button oneBtn; // Value injected by FXMLLoader

    @FXML // fx:id="plusBtn"
    private Button plusBtn; // Value injected by FXMLLoader

    @FXML // fx:id="sevenBtn"
    private Button sevenBtn; // Value injected by FXMLLoader

    @FXML // fx:id="sixBtn"
    private Button sixBtn; // Value injected by FXMLLoader

    @FXML // fx:id="solveBtn"
    private Button solveBtn; // Value injected by FXMLLoader

    @FXML // fx:id="subBtn"
    private Button subBtn; // Value injected by FXMLLoader

    @FXML // fx:id="threeBtn"
    private Button threeBtn; // Value injected by FXMLLoader

    @FXML // fx:id="twoBtn"
    private Button twoBtn; // Value injected by FXMLLoader

    @FXML // fx:id="zeroBtn"
    private Button zeroBtn; // Value injected by FXMLLoader

    @FXML
    void ClearExp(ActionEvent event) {
        mainTF.clear();
    }

    @FXML
    void calc(ActionEvent event) {
        String str = mainTF.getText();
        if(modeTF.getText().equals("Dec")){
            DecCalc currCalc = new DecCalc();
            mainTF.setText(currCalc.decCalc(str));
        }else{
            HexCalc currCalc = new HexCalc();
            mainTF.setText(convertDecToHexStr(currCalc.hexCalc(str)));
        }
    }

    @FXML
    void pressA(ActionEvent event) {
        mainTF.appendText("A");
    }

    @FXML
    void pressB(ActionEvent event) {
        mainTF.appendText("B");
    }

    @FXML
    void pressC(ActionEvent event) {
        mainTF.appendText("C");
    }

    @FXML
    void pressD(ActionEvent event) {
        mainTF.appendText("D");
    }

    @FXML
    void pressDiv(ActionEvent event) {
        mainTF.appendText("/");
    }

    @FXML
    void pressE(ActionEvent event) {
        mainTF.appendText("E");
    }

    @FXML
    void pressEight(ActionEvent event) {
        mainTF.appendText("8");
    }

    @FXML
    void pressF(ActionEvent event) {
        mainTF.appendText("F");
    }

    @FXML
    void pressFive(ActionEvent event) {
        mainTF.appendText("5");
    }

    @FXML
    void pressFour(ActionEvent event) {
        mainTF.appendText("4");
    }

    @FXML
    void pressMul(ActionEvent event) {
        mainTF.appendText("*");
    }

    @FXML
    void pressNine(ActionEvent event) {
        mainTF.appendText("9");
    }

    @FXML
    void pressPlus(ActionEvent event) {
        mainTF.appendText("+");
    }

    @FXML
    void pressSeven(ActionEvent event) {
        mainTF.appendText("7");
    }

    @FXML
    void pressSix(ActionEvent event) {
        mainTF.appendText("6");
    }

    @FXML
    void pressSub(ActionEvent event) {
        mainTF.appendText("-");
    }

    @FXML
    void pressThree(ActionEvent event) {
        mainTF.appendText("3");
    }

    @FXML
    void pressTwo(ActionEvent event) {
        mainTF.appendText("2");
    }

    @FXML
    void pressZero(ActionEvent event) {
        mainTF.appendText("0");
    }

    @FXML
    void presssOne(ActionEvent event) {
        mainTF.appendText("1");
    }

    @FXML
    void switchMode(ActionEvent event) {
        String currMode = modeTF.getText();
        if(mainTF.getText()!=null){
            if(currMode.equals("Hex")){
                mainTF.setText(convertHexToDecStr(mainTF.getText()));
            }else{
                mainTF.setText(convertDecToHexStr(mainTF.getText()));
            }
        }
        if(currMode.equals("Hex")){
            modeTF.setText("Dec");
            aBtn.setDisable(true);
            bBtn.setDisable(true);
            cBtn.setDisable(true);
            dBtn.setDisable(true);
            eBtn.setDisable(true);
            fBtn.setDisable(true);
        }else{
            modeTF.setText("Hex");
            aBtn.setDisable(false);
            bBtn.setDisable(false);
            cBtn.setDisable(false);
            dBtn.setDisable(false);
            eBtn.setDisable(false);
            fBtn.setDisable(false);
        }
    }

    String convertHexToDecStr(String str){
        char[] chArr = str.toCharArray();
        int num = 0;
        for(int i=0;i<chArr.length;i++){
            switch (chArr[i]){
                case '0':num = 16*num;
                         break;
                case '1':num = 16*num + 1;
                         break;
                case '2':num = 16*num + 2;
                         break;
                case '3':num = 16*num + 3;
                         break;
                case '4':num = 16*num + 4;
                         break;
                case '5':num = 16*num + 5;
                         break;
                case '6':num = 16*num + 6;
                         break;
                case '7':num = 16*num + 7;
                         break;
                case '8':num = 16*num + 8;
                         break;
                case '9':num = 16*num + 9;
                         break;
                case 'A':num = 16*num + 10;
                         break;
                case 'B':num = 16*num + 11;
                         break;
                case 'C':num = 16*num + 12;
                         break;
                case 'D':num = 16*num + 13;
                         break;
                case 'E':num = 16*num + 14;
                         break;
                case 'F':num = 16*num + 15;
                         break;
            }
        }
        return String.valueOf(num);
    }

    String convertDecToHexStr(String str){
        char[] chArr = str.toCharArray();
        int num = 0;
        for(int i=0;i<chArr.length;i++){
            switch (chArr[i]){
                case '0':num = 10*num;
                         break;
                case '1':num = 10*num + 1;
                         break;
                case '2':num = 10*num + 2;
                         break;
                case '3':num = 10*num + 3;
                         break;
                case '4':num = 10*num + 4;
                         break;
                case '5':num = 10*num + 5;
                         break;
                case '6':num = 10*num + 6;
                         break;
                case '7':num = 10*num + 7;
                         break;
                case '8':num = 10*num + 8;
                         break;
                case '9':num = 10*num + 9;
                         break;
            }
        }
        return Integer.toHexString(num).toUpperCase();
    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        modeTF.setText("Hex");
        assert clearBtn != null : "fx:id=\"clearBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert modeBtn != null : "fx:id=\"modeBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert modeTF != null : "fx:id=\"modeTF\" was not injected: check your FXML file 'sample.fxml'.";
        assert zeroBtn != null : "fx:id=\"zeroBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert oneBtn != null : "fx:id=\"oneBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert twoBtn != null : "fx:id=\"twoBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert threeBtn != null : "fx:id=\"threeBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert fourBtn != null : "fx:id=\"fourBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert fiveBtn != null : "fx:id=\"fiveBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert sixBtn != null : "fx:id=\"sixBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert sevenBtn != null : "fx:id=\"sevenBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert eightBtn != null : "fx:id=\"eightBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert nineBtn != null : "fx:id=\"nineBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert aBtn != null : "fx:id=\"aBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert bBtn != null : "fx:id=\"bBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert cBtn != null : "fx:id=\"cBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert dBtn != null : "fx:id=\"dBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert eBtn != null : "fx:id=\"eBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert fBtn != null : "fx:id=\"fBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert divBtn != null : "fx:id=\"divBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert mulBtn != null : "fx:id=\"mulBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert solveBtn != null : "fx:id=\"solveBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert subBtn != null : "fx:id=\"subBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert plusBtn != null : "fx:id=\"plusBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert mainTF != null : "fx:id=\"mainTF\" was not injected: check your FXML file 'sample.fxml'.";

        // Initialize your logic here: all @FXML variables will have been injected

    }

}
