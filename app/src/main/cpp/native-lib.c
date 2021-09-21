#include <jni.h>

JNIEXPORT jint JNICALL
Java_com_example_myapplication_NativeLibrary_calculateToJni(JNIEnv *env, jobject obj, jint value1,
															jint value2) {
	return (value1 * value2);
}