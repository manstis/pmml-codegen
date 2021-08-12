This is a special distribution for use with J2CL.

See https://github.com/Vertispan/j2clmavenplugin/issues/72

The J2CL Maven Plugin gathers details of **ALL** dependencies for a JAR whether direct or transitive. 
It does not filter this _complete_ list of **ALL** dependencies based on any `<dependency><exclusions>` defined.
Consequentially it was not possible to remove the `@XMLMapper` annotation processor from J2CL processing 
and all related JAXB/XJC transitive dependencies.

This module strips all dependencies and shadows required classes.
