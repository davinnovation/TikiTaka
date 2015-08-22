package com.davinnovation.encog.HMM;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadMidi {
	
	private ArrayList<String> midipath;
	
	public ArrayList<String> getMidipath() {
		return midipath;
	}

	public void setMidipath(ArrayList<String> midipath) {
		this.midipath = midipath;
	}

	ReadMidi(File dir)
	{
		File[] midifiles = dir.listFiles();
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