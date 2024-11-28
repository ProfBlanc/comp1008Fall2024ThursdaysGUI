module ca.georgiancollege.comp1008fall2024thursdaysgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1008fall2024thursdaysgui to javafx.fxml;
    exports ca.georgiancollege.comp1008fall2024thursdaysgui;
}