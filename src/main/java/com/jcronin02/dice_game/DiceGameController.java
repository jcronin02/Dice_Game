package com.jcronin02.dice_game;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Random;

public class DiceGameController {
    Random rand = new Random();
    private int attempts = 0;

    @FXML
    private Label dice1Text;
    @FXML
    private Label dice2Text;
    @FXML
    private Label statusText;
    @FXML
    private Label attemptsText;

    @FXML void rollDice() {
        int num1, num2;

        num1 = rand.nextInt(6)+1;
        num2 = rand.nextInt(6)+1;

        dice1Text.setText("Dice 1: " + num1);
        dice2Text.setText("Dice 2: " + num2);

        if(num1 == num2){
            attempts = 0;
            statusText.setText("Current Status: WIN!");
        } else {
            attempts++;
            statusText.setText("Current Status: LOSE: try again!");
        }
        attemptsText.setText("Attempts since last win: " + attempts);
    }
}