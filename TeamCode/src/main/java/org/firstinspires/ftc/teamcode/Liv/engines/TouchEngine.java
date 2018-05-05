package org.firstinspires.ftc.teamcode.Liv.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.Liv.states.motors.Sensors.ATouchSensor;

/**
 * Created by Liv on 5/5/2018.
 */
@Autonomous (name = "TouchSensorA")
public class TouchEngine extends Engine {
    @Override
    public void setProcesses() {
        addState(new ATouchSensor(this));
    }
}
