package org.firstinspires.ftc.teamcode.Liv.states.motors.Sensors;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by Liv on 5/5/2018.
 */

public class ATouchSensor extends State {
    TouchSensor touchSensor;
    private DcMotor motor;

    public ATouchSensor(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void init() {
        super.init();
        touchSensor = engine.hardwareMap.touchSensor.get("myTouchSensor");
        motor = engine.hardwareMap.dcMotor.get("myDcMotor");
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    @Override
    public void exec() {
        if (touchSensor.isPressed()) {
            engine.telemetry.addData("Touchsensor", "Pressed");
            motor.setPower(0);
        } else {
            engine.telemetry.addData("Touchsensor", "NotPressed");
            motor.setPower(1);
        }
        engine.telemetry.update();

    }
}




