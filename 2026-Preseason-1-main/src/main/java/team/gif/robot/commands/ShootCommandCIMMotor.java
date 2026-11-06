package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.subsystems.CIM_Motor;
import team.gif.robot.Robot;
import team.gif.robot.Constants;

import java.awt.*;

public class ShootCommandCIMMotor extends Command {

    public ShootCommandCIMMotor() {
        super();
        addRequirements(Robot.cimMotor1);
        addRequirements(Robot.cimMotor2);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        Robot.cimMotor1.setPercent(Constants.SHOOTER_PERCENT);
        Robot.cimMotor2.setPercent(Constants.SHOOTER_PERCENT);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() { return true; }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.cimMotor1.stop();
        Robot.cimMotor2.stop();
    }
}
