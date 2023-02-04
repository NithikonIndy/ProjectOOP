package model;

public class syntaxError extends Exception {
    public syntaxError() {
    }

    public syntaxError(String errorMessage) {
        super(errorMessage);
    }
}