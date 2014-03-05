package org.home.jni.msc;

public class MSCGen {
	private String imageType;
	private String inputFileName;
	private String outputFileName;
	private String inputFilePath;
	private String outputFilePath;

	static {
		System.loadLibrary("Mscgen");
		System.loadLibrary("Generate");
	}
	
	public native int generate(String imageType, String inFile, String outFile);
	
	public void setImageType(String imageType) {
		// TODO Auto-generated method stub
		this.imageType = imageType;
	}
	
	public void setInputFilePath(String inputFilePath) {
		// TODO Auto-generated method stub
		this.inputFilePath = inputFilePath;
	}
	
	public void setOutputFilePath(String outputFilePath) {
		// TODO Auto-generated method stub
		this.outputFilePath = outputFilePath;
	}
	public int generate() {
		// TODO Auto-generated method stub
		return generate(imageType, inputFilePath, outputFilePath);
	}
}
