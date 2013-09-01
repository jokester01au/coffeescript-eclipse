
[ERROR] Cannot resolve project dependencies:
[ERROR]   Software being installed: csep.tests 0.4.0.qualifier
[ERROR]   Missing requirement: csep.tests 0.4.0.qualifier requires 'bundle org.junit4 0.0.0' but it could not be found
[ERROR]
[ERROR] Internal error: java.lang.RuntimeException: "No solution found because the problem is unsatisfiable.": ["Unable to satisfy dependency from csep.tests 0.4.0.qualifier to bundle org.ju
.", "Unable to satisfy dependency from org.eclipse.jdt.core 3.9.0.v_OTDT_r220_201306071800 to org.eclipse.objectteams.otdt.core.patch.feature.group [2.0.0,3.0.0).", "Unable to satisfy depend
org.eclipse.xtext.ui 2.3.0.v201206120633 to bundle com.ibm.icu [4.0.0,5.0.0).", "Unable to satisfy dependency from org.eclipse.xtext.ui 2.3.1.v201208210947 to bundle com.ibm.icu [4.0.0,5.0.0
olution found because the problem is unsatisfiable."] -> [Help 1]
org.apache.maven.InternalErrorException: Internal error: java.lang.RuntimeException: "No solution found because the problem is unsatisfiable.": ["Unable to satisfy dependency from csep.tests
lifier to bundle org.junit4 0.0.0.", "Unable to satisfy dependency from org.eclipse.jdt.core 3.9.0.v_OTDT_r220_201306071800 to org.eclipse.objectteams.otdt.core.patch.feature.group [2.0.0,3.
nable to satisfy dependency from org.eclipse.xtext.ui 2.3.0.v201206120633 to bundle com.ibm.icu [4.0.0,5.0.0).", "Unable to satisfy dependency from org.eclipse.xtext.ui 2.3.1.v201208210947 t
om.ibm.icu [4.0.0,5.0.0).", "No solution found because the problem is unsatisfiable."]
        at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:168)
        at org.apache.maven.cli.MavenCli.execute(MavenCli.java:537)
        at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:196)
        at org.apache.maven.cli.MavenCli.main(MavenCli.java:141)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:606)
        at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:290)
        at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:230)
        at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:409)
        at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:352)
Caused by: java.lang.RuntimeException: "No solution found because the problem is unsatisfiable.": ["Unable to satisfy dependency from csep.tests 0.4.0.qualifier to bundle org.junit4 0.0.0.",
o satisfy dependency from org.eclipse.jdt.core 3.9.0.v_OTDT_r220_201306071800 to org.eclipse.objectteams.otdt.core.patch.feature.group [2.0.0,3.0.0).", "Unable to satisfy dependency from org
text.ui 2.3.0.v201206120633 to bundle com.ibm.icu [4.0.0,5.0.0).", "Unable to satisfy dependency from org.eclipse.xtext.ui 2.3.1.v201208210947 to bundle com.ibm.icu [4.0.0,5.0.0).", "No solu
 because the problem is unsatisfiable."]
        at org.eclipse.tycho.p2.resolver.AbstractResolutionStrategy.newResolutionException(AbstractResolutionStrategy.java:98)
        at org.eclipse.tycho.p2.resolver.ProjectorResolutionStrategy.resolve(ProjectorResolutionStrategy.java:88)
        at org.eclipse.tycho.p2.resolver.AbstractResolutionStrategy.resolve(AbstractResolutionStrategy.java:63)
        at org.eclipse.tycho.p2.impl.resolver.P2ResolverImpl.resolveDependencies(P2ResolverImpl.java:126)
        at org.eclipse.tycho.p2.impl.resolver.P2ResolverImpl.resolveDependencies(P2ResolverImpl.java:81)
        at org.eclipse.tycho.p2.resolver.P2TargetPlatformResolver.doResolvePlatform(P2TargetPlatformResolver.java:374)
        at org.eclipse.tycho.p2.resolver.P2TargetPlatformResolver.resolveDependencies(P2TargetPlatformResolver.java:350)
        at org.eclipse.tycho.core.resolver.DefaultTychoDependencyResolver.resolveProject(DefaultTychoDependencyResolver.java:109)
        at org.eclipse.tycho.core.maven.TychoMavenLifecycleParticipant.afterProjectsRead(TychoMavenLifecycleParticipant.java:82)
        at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:273)
        at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:156)