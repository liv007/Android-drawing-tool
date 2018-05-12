package org.firstinspires.ftc.teamcode.Liv.teleop;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.engine.Engine;

/**
 * Created by Liv on 5/12/2018.
 */
@TeleOp (name = "Test Teleop")
public class TeleopEngineA extends Engine {
    @Override
    public void setProcesses() {
        addState(new MotorControlA(this));

    }
}
