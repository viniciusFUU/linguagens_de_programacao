module forms.com {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    exports forms.com to javafx.graphics;
    exports forms.com.controllers to javafx.fxml;
    opens forms.com.controllers to javafx.fxml;
}
