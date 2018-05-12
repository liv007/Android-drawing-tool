package org.firstinspires.ftc.teamcode.Liv.teleop;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by Liv on 5/12/2018.
 */

public class MotorControlA extends State {
    private DcMotor motor;

    public MotorControlA(Engine engine) {
        this.engine = engine;
    }
    /*           */

    @Override
    public void exec() {
                if(engine.gamepad1.a == true){
                    motor.setPower(1.0);
                }
                if(engine.gamepad1.x == true){
                    motor.setPower(-1.0);
                }
                if (engine.gamepad1.b == true) {
                    motor.setPower(0.5);
                }
                if (engine.gamepad1.y) {
                    motor.setPower(0.0);
                }

    }

    public void init(){
       motor= this.engine.hardwareMap.dcMotor.get("motor");
    }
}
