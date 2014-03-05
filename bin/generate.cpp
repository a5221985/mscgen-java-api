#include "org_home_jni_msc_MSCGen.h"
extern "C"{
#include "msc_gen.h"
}
#include <iostream>
#include <stdlib.h>
#include <string.h>
using namespace std;

JNIEXPORT jint JNICALL Java_org_home_jni_msc_MSCGen_generate
  (JNIEnv *env, jobject thisObject, jstring imageType, jstring inFile, jstring outFile)
{
	const char *typeString = env->GetStringUTFChars(imageType, NULL);
	const char *inFileString = env->GetStringUTFChars(inFile, NULL);
	const char *outFileString = env->GetStringUTFChars(outFile, NULL);
	
	const int argc = 7;
	const char *argv[] = {"mscgen", "-T", typeString, "-i", inFileString, "-o", outFileString};
	return generate_msc(argc, argv);
}
