package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class runTo {
    public float goTo(DcMotor armMotor,float curPos, float goal) {
        int power = 1;
        if (curPos > goal) {
            armMotor.setDirection(DcMotor.Direction.FORWARD);
            armMotor.setPower(power);
        } else if (curPos < goal) {
            armMotor.setDirection(DcMotor.Direction.REVERSE);
            armMotor.setPower(power);
        } else {
            armMotor.setPower(0);
        }
        return goal;
    }
    public float goTo(DcMotor armMotor,float curPos, float goal,int power) {
        if (curPos > goal) {
            armMotor.setDirection(DcMotor.Direction.FORWARD);
            armMotor.setPower(power);
        } else if (curPos < goal) {
            armMotor.setDirection(DcMotor.Direction.REVERSE);
            armMotor.setPower(power);
        } else {
            armMotor.setPower(0);
        }
        return goal;
    }
}
