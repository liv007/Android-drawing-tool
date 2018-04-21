package org.firstinspires.ftc.teamcode.Liv.states.motors;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by Liv on 4/14/2018.
 */

public class MotorTheSequel extends State {                                           //block- a chunk of code
    private DcMotor motor;
    private double power;
    private int ticks;


    public MotorTheSequel(Engine engine, double power, int ticks) {
        this.engine = engine;
        this.power = power;
        this.ticks = ticks;
        //formatting for how you type in state in TestEngine "(this, -0.8, 500)"
    }
    @Override
    public void init (){
        motor = engine.hardwareMap.dcMotor.get("myDcMotor");
        motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //provides information to phone
    }
    @Override
    public void exec() {
        motor.setTargetPosition(ticks);
        motor.setPower(power);
        engine.telemetry.addData("Ticks", motor.getCurrentPosition());
        engine.telemetry.update();
    }
}
