package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.utils.Hardware;
import org.firstinspires.ftc.teamcode.utils.Robot;

public class Autonomous {

    private LinearOpMode opMode;
    private Hardware hardware;

    private int side;
    private int color;

    public Autonomous(){
        side = Robot.getSide();
        color = Robot.getColor();
        opMode = Robot.getOpmode();
        hardware = Robot.getHardware();
    }

    public void init(){

    }

    public void run(){

    }
}
