package cn.poco.image;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class PocoNativeFilter 
{
	static 
	{
		System.loadLibrary("PocoImage");
	}
	
//	public static native int detectR2(int[] result, int size, Bitmap destBmp, Bitmap tempBmp, float scale);
//	public static native int Face_feature(Bitmap destBmp, int []feature_arr, int []detectPts, String info_path, String leaf_path);
	public static native int getCpuCoreCount();

//
//==========================================================================================
//
//Nomal 
	
//	public static native int moreBeaute(Bitmap dest,int light,int blur,int sharpen,int hue);
	public static native int moreBeauteUser(Bitmap destBmp, int light, int blur, int hue);
//	public static native int moreBeaute2(Bitmap dest,Bitmap src,int light,int blur,int sharpen,int hue);

	public static native int moreBeauteNormal(Bitmap destBmp);
	public static native int moreBeauteClear(Bitmap destBmp);
	public static native int moreBeauteMidd(Bitmap destBmp);
	public static native int moreBeauteLittle(Bitmap destBmp);
	public static native int moreBeauteSexy(Bitmap destBmp);
}
