package org.firstinspires.ftc.teamcode.Liv.engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.Liv.states.motors.MotorChallengeA;

/**
 * Created by Liv on 6/2/2018.
 */
@Autonomous (name = "Motor Challenge")
public class EngineChallenge extends Engine {
    @Override
    public void setProcesses() {
        addState(new MotorChallengeA(this, 0.5));
    }
}
