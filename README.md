# KLLdeserializer

Utility project to help de-serializing binary representations of [KLL data sketches](https://datasketches.apache.org/docs/KLL/KLLSketch.html) for debugging purpose.

For de-serializing the string representation of a binary serialization of KLL, change the string in the KLLDeserialize's main method and run the program. The KLL info (as provided by the `toString()` method) are printed in standard output.