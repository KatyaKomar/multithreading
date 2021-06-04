package by.task.komar.state;

import by.task.komar.entity.Ship;
import by.task.komar.exception.PortException;

import java.io.IOException;

public interface ShipState {
    void waitingState(Ship ship);

    void receptionState(Ship ship) throws PortException, IOException;

    void endState(Ship ship) throws PortException, IOException;
}
