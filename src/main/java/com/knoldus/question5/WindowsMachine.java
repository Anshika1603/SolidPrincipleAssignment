package com.knoldus.question5;

public class WindowsMachine {
    public final InputDevice keyboard; // Represents the input device, such as a keyboard.
    public final OutputDevice monitor; // Represents the output device, such as a monitor.

    public WindowsMachine(InputDevice keyboard,OutputDevice monitor) {
        this.keyboard = keyboard; // Initializes the input device instance.
        this.monitor = monitor; // Initializes the output device instance.
    }
}
