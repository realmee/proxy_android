// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package grpc.client;

public final class Service {
  private Service() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\022\013grpc.client\032\022installati" +
      "on.proto\032\rupgrade.proto\032\013start.proto\032\014ga" +
      "ming.proto\032\nlink.proto\032\013event.proto\032\013spe" +
      "ed.proto\032\013fault.proto2\345\004\n\016AndroidService" +
      "\022T\n\022ReportInstallation\022\034.grpc.client.Ins" +
      "tallationMsg\032\036.grpc.client.InstallationR" +
      "eply\"\000\022E\n\rReportUpgrade\022\027.grpc.client.Up" +
      "gradeMsg\032\031.grpc.client.UpgradeReply\"\000\022?\n" +
      "\013ReportStart\022\025.grpc.client.StartMsg\032\027.gr" +
      "pc.client.StartReply\"\000\022B\n\014ReportGaming\022\026",
      ".grpc.client.GamingMsg\032\030.grpc.client.Gam" +
      "ingReply\"\000\022I\n\nReportLink\022\032.grpc.client.G" +
      "amingLinkMsg\032\033.grpc.client.GamingLinkDon" +
      "e\"\000(\001\022?\n\013ReportEvent\022\025.grpc.client.Event" +
      "Msg\032\027.grpc.client.EventReply\"\000\022d\n\026Report" +
      "NetworkStability\022\".grpc.client.NetworkMe" +
      "asurementMsg\032$.grpc.client.NetworkMeasur" +
      "ementReply\"\000\022?\n\013ReportFault\022\025.grpc.clien" +
      "t.FaultMsg\032\027.grpc.client.FaultReply\"\000b\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          grpc.client.Installation.getDescriptor(),
          grpc.client.Upgrade.getDescriptor(),
          grpc.client.Start.getDescriptor(),
          grpc.client.Gaming.getDescriptor(),
          grpc.client.Link.getDescriptor(),
          grpc.client.EventOuterClass.getDescriptor(),
          grpc.client.Speed.getDescriptor(),
          grpc.client.Fault.getDescriptor(),
        }, assigner);
    grpc.client.Installation.getDescriptor();
    grpc.client.Upgrade.getDescriptor();
    grpc.client.Start.getDescriptor();
    grpc.client.Gaming.getDescriptor();
    grpc.client.Link.getDescriptor();
    grpc.client.EventOuterClass.getDescriptor();
    grpc.client.Speed.getDescriptor();
    grpc.client.Fault.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
