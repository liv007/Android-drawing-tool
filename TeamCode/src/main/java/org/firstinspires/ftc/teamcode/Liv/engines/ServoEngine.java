package org.firstinspires.ftc.teamcode.Liv.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.Liv.states.motors.ServoState;

/**
 * Created by Liv on 4/7/2018.
 */
@Autonomous(name = "Servo Engine")
public class ServoEngine extends Engine {
    @Override
    public void setProcesses() {
        addState(new ServoState(this, 0.5, 100));
        addState(new ServoState(this, 0.0, 100));
        addState(new ServoState(this, 1.0, 100));
        addState(new ServoState(this, 0.0, 100));
        addState(new ServoState(this, -1.0, 100));

    }
}
