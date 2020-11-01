package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerCreate extends ControllerSearch {
    @FXML
    private TextField textFieldLastName;

    @FXML
    private TextField textFieldFirstName;

    @FXML
    private TextField textFieldPatronymic;

    @FXML
    private TextField textFieldDateOfBirth;

    @FXML
    private TextField textFieldGender;

    @FXML
    private TextField textFieldDateOfPreparingReport;

    @FXML
    private TextField textFieldDateOfCommission;

    @FXML
    private TextField textFieldRegion;

    @FXML
    private TextField textFieldOutdoors;

    @FXML
    private TextField textFieldCountry;

    @FXML
    private TextField textFieldPlaceOfCommission;

    @FXML
    private TextField textFieldDateOfInitiation;

    @FXML
    private TextField textFieldOfficeOfInitiation;

    @FXML
    private TextField textFieldNameOfInitiation;

    @FXML
    private TextField textFieldNameOfPreparingReport;

    @FXML
    private TextField textFieldArticle;

    @FXML
    private TextField textFieldOfficeOfDecision;

    @FXML
    private TextField textFieldPunishment;

    @FXML
    private TextField textFieldPunishmentSum;

    @FXML
    private TextField textFieldDateOfEntryIntoForce;

    @FXML
    private TextField textFieldAmount;

    @FXML
    private TextField textFieldOfficeArrival;

    @FXML
    private TextField textFieldOfficeDeparture;


    @FXML
    private TextField textFieldDateSentenceEnforcement;

    @FXML
    private TextField textFieldDateOfDecision;

    @FXML
    private TextField textFieldDateArrival;

    @FXML
    private TextField textFieldDateDeparture;

    @FXML
    private TextField textFieldDecision;

    @FXML
    private TextField textFieldNameOfDecision;

    @FXML
    private TextField textFieldOfficeOfPreparingReport;

    @FXML
    private TextField textFieldID1;

    @FXML
    private TextField textFieldID2;

    @FXML
    private TextField textFieldID3;

    @FXML
    private TextField textFieldID4;

    @FXML
    private Button buttonAdd;

    private static final DatabaseHandler dbHandler = new DatabaseHandler();

    @Override
    protected void initialize() {

    }

    @FXML
    private void add() {
        buttonAdd.setOnAction(event -> {
            String id = textFieldID1.getText() + textFieldID2.getText() + textFieldID3.getText() + textFieldID4.getText();
            dbHandler.createCard(Integer.parseInt(id), textFieldLastName.getText(),
                    Integer.parseInt(textFieldFirstName.getText()), Integer.parseInt(textFieldPatronymic.getText()),
                    textFieldDateOfBirth.getText(), Integer.parseInt(textFieldGender.getText()),
                    Integer.parseInt(textFieldCountry.getText()), Integer.parseInt(textFieldRegion.getText()),
                    textFieldOutdoors.getText(), textFieldDateOfCommission.getText(), textFieldPlaceOfCommission.getText(),
                    textFieldDateOfInitiation.getText(), Integer.parseInt(textFieldOfficeOfInitiation.getText()),
                    textFieldNameOfInitiation.getText(), textFieldDateOfPreparingReport.getText(),
                    Integer.parseInt(textFieldOfficeOfPreparingReport.getText()),
                    textFieldNameOfPreparingReport.getText(), Integer.parseInt(textFieldArticle.getText()),
                    textFieldDateOfDecision.getText(), textFieldDecision.getText(),
                    Integer.parseInt(textFieldOfficeOfDecision.getText()), textFieldNameOfDecision.getText(),
                    Integer.parseInt(textFieldPunishment.getText()), Integer.parseInt(textFieldPunishmentSum.getText()),
                    textFieldDateOfEntryIntoForce.getText(), textFieldDateSentenceEnforcement.getText(),
                    Integer.parseInt(textFieldAmount.getText()));
            dbHandler.addReferral(Integer.parseInt(id), textFieldDateDeparture.getText(), Integer.parseInt(textFieldOfficeDeparture.getText()),
                    textFieldDateArrival.getText(), Integer.parseInt(textFieldOfficeArrival.getText()));
        });
    }
}
