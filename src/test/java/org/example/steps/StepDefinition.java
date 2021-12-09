package org.example.steps;

import io.cucumber.java.pt.Dado;
import org.example.pages.GooglePageObject;

public class StepDefinition {

    private final GooglePageObject googlePageObject;

    public StepDefinition(GooglePageObject googlePageObject) {
        this.googlePageObject = googlePageObject;
    }

    @Dado("abertura do google")
    public void abrirGoogle() {
        googlePageObject.acessarGoogle();
    }
}
