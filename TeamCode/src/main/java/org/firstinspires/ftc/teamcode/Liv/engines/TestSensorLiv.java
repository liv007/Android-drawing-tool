package org.firstinspires.ftc.teamcode.Liv.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.ColorSensor;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.Liv.states.motors.MotorTheSequel;
import org.firstinspires.ftc.teamcode.Liv.states.motors.Sensors.AColorSensor;
import org.firstinspires.ftc.teamcode.Liv.states.motors.Sensors.ATouchSensor;

/**
 * Created by Liv on 4/21/2018.
 */
@Autonomous(name = "TestSensorLiv")
public class TestSensorLiv extends Engine {
    @Override
    public void setProcesses() {

        addState(new ATouchSensor(this));
        addState(new AColorSensor(this));


    }
}
