package org.firstinspires.ftc.teamcode.Liv.states.motors;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by Liv on 6/2/2018.
 */

public class MotorChallengeA extends State {
    private DcMotor RightMotor;
    private DcMotor LeftMotor;
    private double power;
    private int RightMotorPosition, LeftMotorPosition;
    private double LeftMotorPower;




    public MotorChallengeA(Engine engine, double power){
        this.engine = engine;
        this.power = power;


    }
    public void init (){
        LeftMotor = engine.hardwareMap.dcMotor.get("motor1");
        RightMotor = engine.hardwareMap.dcMotor.get("motor2");
        LeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        RightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        LeftMotorPower = power;

    }


    @Override
    public void exec() {
        RightMotorPosition = RightMotor.getCurrentPosition();
        LeftMotorPosition = LeftMotor.getCurrentPosition();
        engine.telemetry.addData("Right Motor Position", RightMotorPosition);
        engine.telemetry.addData("Left Motor Position", LeftMotorPosition);
        engine.telemetry.addData("Difference", RightMotorPosition-LeftMotorPosition);
        engine.telemetry.update();
        if(RightMotorPosition>LeftMotorPosition){
            LeftMotorPower = LeftMotorPosition-0.001;
        }else if(LeftMotorPosition>RightMotorPosition){
            LeftMotorPower = LeftMotorPower+0.001;
        }
        LeftMotor.setPower(LeftMotorPower);
        RightMotor.setPower(power);


    }
}
