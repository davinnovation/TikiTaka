package com.davinnovation.encog.HMM;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadMidi {
	
	private ArrayList<String> midipath;
	private int[] pre_start;
	private int[] pre_velocity;
	private int[] pre_transition;
	public ArrayList<String> getMidipath() {
		return midipath;
	}
	
	public double[] normalize_start()
	{
		double[] start = new double[128];
		return start;
	}
	
	public double[][] normalize_velocity()
	{
		double[][] velocity = new double[128][128];
		return velocity;
	}
	
	public double[][] normalize_transition()
	{
		double[][] transition = new double[128][128];
		return transition;
	}
	
	public void setMidipath(ArrayList<String> midipath) {
		this.midipath = midipath;
	}

	ReadMidi(File dir)
	{
		File[] midifiles = dir.listFiles();
		midipath = new ArrayList<String>();
		for (File midifile : midifiles)
		{
			 if(!midifile.isDirectory()) // IF midifile is file
			 {
				 try
				 {
					 if(isMidi(midifile))
					 {
						 midipath.add(midifile.getCanonicalPath());
					 }
				 } catch (IOException e) {e.printStackTrace();}
			 }
		}
	}
	
	boolean isMidi(File midifile)
	{
		return midifile.getName().substring(midifile.getName().lastIndexOf(".")+1).equals("mid");
	}
}