module com.example.dice_game {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.jcronin02.dice_game to javafx.fxml;
    exports com.jcronin02.dice_game;
}