#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_example_ndkhidedata_MainActivity_getEncryptedKey(JNIEnv *env, jobject object) {
 std::string encrypted_key = "Tech Brainz";
 return env->NewStringUTF(encrypted_key.c_str());
}