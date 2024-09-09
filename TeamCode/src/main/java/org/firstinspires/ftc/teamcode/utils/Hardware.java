package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Hardware and interactions with hardware are handled here.
 *
 * @author github.com/jakeslye
 */
public class Hardware {

    public static int FORWARD = 0;
    public static int REVERSE = 1;


    private LinearOpMode opMode;

    private DcMotor motorFL;
    private DcMotor motorFR;
    private DcMotor motorBL;
    private DcMotor motorBR;

    public Hardware(){
        this.opMode = Robot.getOpmode();

        motorFL = opMode.hardwareMap.get(DcMotor.class, "motorFL");
        motorFR = opMode.hardwareMap.get(DcMotor.class, "motorFR");
        motorBL = opMode.hardwareMap.get(DcMotor.class, "motorBL");
        motorBR = opMode.hardwareMap.get(DcMotor.class, "motorBR");
    }

    public void doController(double x, double y, double rx){
        y *= -1;

        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1) * 1.1;
        double frontLeftPower = (y + x + rx) / denominator;
        double backLeftPower = (y - x + rx) / denominator;
        double frontRightPower = (y - x - rx) / denominator;
        double backRightPower = (y + x - rx) / denominator;

        motorFL.setPower(frontLeftPower);
        motorBL.setPower(-backLeftPower);
        motorFR.setPower(frontRightPower);
        motorBR.setPower(-backRightPower);
    }

    public void go(int direction){
        if(direction == Hardware.FORWARD){
            doController(0, 1, 0);
        }else if(direction == Hardware.REVERSE){
            doController(0, -1, 0);
        }
    }

    public void turn(){

    }

    public void stop(){
        motorFL.setPower(0);
        motorBL.setPower(0);
        motorFR.setPower(0);
        motorBR.setPower(0);
    }


    public DcMotor getMotorFL(){return motorFL;}
    public DcMotor getMotorBL(){return motorBL;}
    public DcMotor getMotorFR(){return motorFR;}
    public DcMotor getMotorBR(){return motorBR;}
}
