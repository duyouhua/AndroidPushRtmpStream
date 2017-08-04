package com.ytx.push;

public class FFmpegUtils {

	public native static void push(String input, String output);

	static {
		System.loadLibrary("avutil-55");
		System.loadLibrary("swresample-2");
		System.loadLibrary("swscale-4");
		System.loadLibrary("avcodec-57");
		System.loadLibrary("avformat-57");
		System.loadLibrary("avfilter-6");

		System.loadLibrary("native-lib");
	}

}
