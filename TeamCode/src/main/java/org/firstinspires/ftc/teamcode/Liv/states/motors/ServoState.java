package org.firstinspires.ftc.teamcode.Liv.states.motors;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by Liv on 4/7/2018.
 */

public class ServoState extends State {
    private Servo servo;
    private double power;
    private int ticks;
    public ServoState(Engine engine) {
        this.engine = engine;
    }

    public ServoState (Engine engine, double power, int ticks) {
        this.engine = engine;
        this.power = power;
        this.ticks = ticks;

    }

    @Override
    public void init (){
        servo = engine.hardwareMap.servo.get("servo");

    }

    @Override
    public void exec() {
        servo.setPosition(power);

        setFinished(true);
    }
}
