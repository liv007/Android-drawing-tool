package org.firstinspires.ftc.teamcode.Liv.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.Liv.states.motors.MotorTheSequel;
import org.firstinspires.ftc.teamcode.Liv.states.motors.ServoState;

/**
 * Created by Liv on 3/31/2018.
 */
@Autonomous(name="TestEngine")
public class TestEngine extends Engine {
    @Override
    public void setProcesses() {
        addState(new MotorTheSequel(this, 0.8, 1000));
        addThreadedState(new ServoState(this, 0.3, 500));
        addState(new MotorTheSequel(this, -0.8, 1000));


    }

}
