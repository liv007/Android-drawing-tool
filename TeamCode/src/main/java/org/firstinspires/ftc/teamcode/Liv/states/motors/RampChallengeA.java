package org.firstinspires.ftc.teamcode.Liv.states.motors;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by Liv on 6/16/2018.
 */

public class RampChallengeA extends State {
    private DcMotor motor;
    private double power;
    //private int motorPosition;
    private int ticks;

    public RampChallengeA(Engine engine, double power) {
        this.engine = engine;
        this.power = power;

    }

    public void init() {
        motor = engine.hardwareMap.dcMotor.get("motor");
        //motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    @Override
    public void exec() {
        motor.setTargetPosition(10);
        motor.setPower(0.01);
        if (power>0.0){
            power*0.02
        }


    }
}

/*
  ramp up for 10 ticks
  flat for 80 ticks
  ramp down for 10 ticks
 */
