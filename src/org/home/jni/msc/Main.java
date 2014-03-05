package org.home.jni.msc;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MSCGen msc = new MSCGen();
		msc.setImageType("png");
		msc.setInputFilePath("/home/abdullah/SVN_Workspace/org.home.jni/io/msc_code.msc");
		msc.setOutputFilePath("/home/abdullah/SVN_Workspace/org.home.jni/io/msc_code.png");
		if(msc.generate() != 0) {
			System.out.println("Failed to generate a message sequence chart!");
		}
		else {
			System.out.println("Successfully generated a message sequence chart...");
		}
	}

}
