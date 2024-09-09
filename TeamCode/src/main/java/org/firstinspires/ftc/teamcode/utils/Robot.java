package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Autonomous;
import org.firstinspires.ftc.teamcode.Drive;

/**
 * Main Robot class. This is the entrypoint of all the code.
 *
 * @author github.com/jakeslye
 */
public class Robot {

    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;

    private static int color;
    private static int side;
    private static LinearOpMode opmode;
    private static Hardware hardware;

    public Robot(LinearOpMode opmode){
        Robot.opmode = opmode;
        Robot.hardware = new Hardware();
    }

    public Robot(LinearOpMode opmode, int color, int side){
        Robot.color = color;
        Robot.side = side;
        Robot.opmode = opmode;
        Robot.hardware = new Hardware();
    }

    public void runDriveMode(){
        Drive d = new Drive();
        d.init();
        opmode.waitForStart();
        d.run();
    }

    public void runAutonomous(){
        Autonomous a = new Autonomous();

        a.init();
        opmode.waitForStart();
        a.run();
    }

    public static Hardware getHardware(){return hardware;}
    public static LinearOpMode getOpmode(){return opmode;}
    public static int getSide(){return side;}
    public static int getColor(){return color;}
}
