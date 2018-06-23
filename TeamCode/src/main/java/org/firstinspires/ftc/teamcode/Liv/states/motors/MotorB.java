package org.firstinspires.ftc.teamcode.Liv.states.motors;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.engine.Engine;
import org.engine.State;

import java.util.Date;

/**
 * Created by Liv on 6/23/2018.
 */

public class MotorB extends State {
    private DcMotor motorA;
    private DcMotor motorB;
    //private DcMotor motorC;
    //private DcMotor motorD;
    private double power;
    private int ticks;
    private int motorAPosition, motorBPosition;
    private long currentTime;
    private boolean FirstTime;
    private long StartTime;

    public MotorB(Engine engine, Double power){
        this.engine = engine;
        this.power = power;


    }

    @Override
    public void init() {
        motorA = engine.hardwareMap.dcMotor.get("motorA");
        motorB = engine.hardwareMap.dcMotor.get("MotorB");
        //motorC = engine.hardwareMap.dcMotor.get("MotorC");
        //motorD = engine.hardwareMap.dcMotor.get("MotorD");
        motorA.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motorB.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //motorC.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //motorD.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        FirstTime = true;

    }

    @Override
    public void exec() {
        if (FirstTime){
            StartTime = new Date().getTime();
            FirstTime = false;
        }else{

        }
        engine.telemetry.addData("Time Passed", currentTime - StartTime);
        engine.telemetry.update();

    }
}
