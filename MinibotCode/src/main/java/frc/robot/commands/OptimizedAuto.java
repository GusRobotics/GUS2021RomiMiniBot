
package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class OptimizedAuto extends SequentialCommandGroup {

    public OptimizedAuto(Drivetrain driveBase) {
        addCommands(new DriveDistance(0.5, 13.5, driveBase), new TurnDegrees(0.5, 270, driveBase),
                new DriveDistance(0.5, 13.5, driveBase), new TurnDegrees(0.5, 270, driveBase),
                new DriveDistance(0.5, 10.5, driveBase), new TurnDegrees(0.5, 270, driveBase),
                new DriveDistance(0.5, 9, driveBase), new TurnDegrees(0.5, 90, driveBase),
                new DriveDistance(0.5, 10.5, driveBase), new TurnDegrees(0.5, 90, driveBase),
                new DriveDistance(0.5, 13.5, driveBase), new TurnDegrees(0.5, 90, driveBase),
                new DriveDistance(0.5, 13.5, driveBase));
    }

}