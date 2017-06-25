import collection.JavaConversions._

enablePlugins(AndroidApp)
 
libraryDependencies ++= Seq(
  "org.apache.maven" % "maven-ant-tasks" % "2.1.3" % "test",
  "org.robolectric" % "robolectric" % "3.0" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  aar("com.android.support" % "design" % "25.0.1")
)
 
exportJars in Test := false // necessary until android-sdk-plugin 1.3.12
 
// or else @Config throws an exception, yay
unmanagedClasspath in Test ++= (bootClasspath in Android).value

showSdkProgress := false
