package de.jensd.fx.fontawesome;

import javafx.scene.text.Font;

public class AwesomeIcon {
    static {
        Font.loadFont(AwesomeIcon.class.getResource("/font/fontawesome-webfont.ttf").toExternalForm(), 14);

    }
}
