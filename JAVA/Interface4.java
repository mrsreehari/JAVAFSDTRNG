package com.ust.examples;

//by default interface members are public
abstract interface MusicPlayer{
  //declare constant fields are public static final
  public static final int defaultVolume = 30;
  //declare methods are public abstract(no body)
  public abstract void play(String s);
  public abstract void stop(String s);
}

class VLCplayer implements MusicPlayer{
	
	public void play(String s) {
		if (s =="melody"||(s =="dance")) {
			System.out.println("play");
		}
		else {
			System.out.println("stop");
		}
	}

public void stop(String s) {
	if(s=="jazz") {
		System.out.println("stop");
	}
	else {
		System.out.println("play");
	}
}
}

public class Interface4{
	public static void main(String[] args) {
		VLCplayer v1=new VLCplayer();
		v1.play("melody");
		v1.stop("jazz");
	}
}