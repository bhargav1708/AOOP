package com.MultipleOperatingSystem;

public class MainApp {
    public static void main(String[] args) {
        // User's choice (e.g., "Windows" or "MacOS")
        String osChoice = "Windows"; // You can change this based on user input

        // Create the appropriate factory
        GUIFactory factory;
        if (osChoice.equals("Windows")) {
            factory = new WindowsGUIFactory();
        } else if (osChoice.equals("MacOS")) {
            factory = new MacOSGUIFactory();
        } else {
            System.out.println("Invalid OS choice. Exiting.");
            return;
        }

        // Create UI components
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        // Render UI components
        button.paint();
        checkbox.paint();
    }
}

