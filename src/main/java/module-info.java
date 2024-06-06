module org.itvitsidlak.mujprvniprojektnagitu {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.itvitsidlak.mujprvniprojektnagitu to javafx.fxml;
    exports org.itvitsidlak.mujprvniprojektnagitu;
}