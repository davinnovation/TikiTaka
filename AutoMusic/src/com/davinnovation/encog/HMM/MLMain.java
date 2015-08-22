package com.davinnovation.encog.HMM;

import java.io.File;

public class MLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String whereisMidi = "./hereismidi";
		File midiFiledir = new File(whereisMidi);
		
		ReadMidi rmMidi = new ReadMidi(midiFiledir);
		String[] midipathList = null;
		rmMidi.getMidipath().toArray(midipathList);
		for(String midipath : midipathList)
		{
			System.out.println(midipath); // Learn
		}
	}

}
