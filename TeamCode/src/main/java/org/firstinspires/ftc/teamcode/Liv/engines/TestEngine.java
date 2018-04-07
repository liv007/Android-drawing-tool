package org.firstinspires.ftc.teamcode.Liv.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.Liv.states.motors.dcDrive;

/**
 * Created by Liv on 3/31/2018.
 */
@Autonomous(name="TestEngine")
public class TestEngine extends Engine {
    @Override
    public void setProcesses() {
        addState(new dcDrive(this, 0.5));

    }

}
