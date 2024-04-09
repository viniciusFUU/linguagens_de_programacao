module forms.com {
    requires javafx.controls;
    requires javafx.fxml;

    exports forms.com to javafx.graphics;
    exports forms.com.controllers to javafx.fxml;
    opens forms.com.controllers to javafx.fxml;
}
