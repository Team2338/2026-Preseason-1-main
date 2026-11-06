// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;

public class CIM_Motor extends SubsystemBase {

    private final TalonSRX cimMotor;

    public CIM_Motor(int canID) {
        cimMotor = new TalonSRX(canID);
    }

    public void setPercent(double percent) {
        cimMotor.set(ControlMode.PercentOutput, percent);
    }

    public void stop(){
        cimMotor.set(ControlMode.PercentOutput, 0.0);
    }

}
