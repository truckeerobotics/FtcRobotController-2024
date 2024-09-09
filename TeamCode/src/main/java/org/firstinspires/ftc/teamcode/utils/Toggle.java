package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.hardware.Gamepad;

import java.util.HashMap;

/**
 * Wrote this code back in 2021. Its not great.
 * TODO: Rewrite toggle class without using a unnecessary hashmap
 * @author github.com/jakeslye
 */
public class Toggle{
    public HashMap<String, Boolean> buttons= new HashMap<>();
    private HashMap<String, Boolean> oldButtons;
    private Gamepad gamepad1;
    private Gamepad gamepad2;


    public Toggle(){
        this.gamepad1 = Robot.getOpmode().gamepad1;
        this.gamepad2 = Robot.getOpmode().gamepad2;
        start();
    }

    /**
     * Returns true if button is being pressed while not being pressed the previous iteration
     * @param button Button Name
     * @return boolean if button is being pressed for the first time this iteration
     */
    public boolean onPush(boolean currentButton, String button){
        boolean result = false;
        if(currentButton && !buttons.get(button)){
            result=true;
        }
        buttons.put(button, currentButton);
        return result;
    }

    public void start(){
        buttons.put("controller1ButtonX", gamepad1.x); //gamepad1.x
        buttons.put("controller1ButtonB", gamepad1.b); //gamepad1.b
        buttons.put("controller1ButtonY", gamepad1.y); //gamepad1.y
        buttons.put("controller1ButtonA", gamepad1.a); //gamepad1.a
        buttons.put("controller1DpadDown", gamepad1.dpad_down); //gamepad1.DpadDown
        buttons.put("controller1DpadLeft", gamepad1.dpad_left); //gamepad1.DpadLeft
        buttons.put("controller1DpadRight", gamepad1.dpad_right); //gamepad1.DpadRight
        buttons.put("controller1DpadUP", gamepad1.dpad_up); //gamepad1.DpadUp
        buttons.put("controller1LeftBumper", gamepad1.left_bumper); //gamepad1.LeftBumper
        buttons.put("controller1RightBumper", gamepad1.right_bumper); //gamepad1.RightBumper
        buttons.put("controller1Back", gamepad1.back); //gamepad1.Back
        buttons.put("controller1Start", gamepad1.start); //gamepad1.Start
        buttons.put("controller1LeftStickButton ", gamepad1.left_stick_button); //gamepad1.LeftStickButton
        buttons.put("controller1RightStickButton ", gamepad1.right_stick_button); //gamepad1.RightStickButton

        buttons.put("controller2ButtonX", gamepad2.x); //gamepad2.x
        buttons.put("controller2ButtonB", gamepad2.b); //gamepad2.b
        buttons.put("controller2ButtonY", gamepad2.y); //gamepad2.y
        buttons.put("controller2ButtonA", gamepad2.a); //gamepad2.a
        buttons.put("controller2DpadDown", gamepad2.dpad_down); //gamepad2.DpadDown
        buttons.put("controller2DpadLeft", gamepad2.dpad_left); //gamepad2.DpadLeft
        buttons.put("controller2DpadRight", gamepad2.dpad_right); //gamepad2.DpadRight
        buttons.put("controller2DpadUP", gamepad2.dpad_up); //gamepad2.DpadUp
        buttons.put("controller2LeftBumper", gamepad2.left_bumper); //gamepad2.LeftBumper
        buttons.put("controller2RightBumper", gamepad2.right_bumper); //gamepad2.RightBumper
        buttons.put("controller2Back", gamepad2.back); //gamepad2.Back
        buttons.put("controller2Start", gamepad2.start); //gamepad2.Start
        buttons.put("controller2LeftStickButton ", gamepad2.left_stick_button); //gamepad2.LeftStickButton
        buttons.put("controller2RightStickButton ", gamepad2.right_stick_button); //gamepad2.RightStickButton
    }
}