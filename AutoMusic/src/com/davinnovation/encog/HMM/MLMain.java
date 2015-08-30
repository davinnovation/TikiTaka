package com.davinnovation.encog.HMM;

import java.io.File;
import java.util.Iterator;
import org.encog.ml.hmm.HiddenMarkovModel;
import org.encog.ml.hmm.distributions.DiscreteDistribution;

public class MLMain {

	static HiddenMarkovModel buildHMM(double[] start,double[][] velocity,double[][] transition)
	{
		HiddenMarkovModel hmm = new HiddenMarkovModel(128,128); // key, Velocity
		
		for(int i = 0;i<128;i++)
			hmm.setPi(i,start[i]);

		for(int i = 0;i<128;i++)
			hmm.setStateDistribution(i, new DiscreteDistribution(new double[][] { velocity[i] }));
		
		for(int i = 0;i<128;i++)
			for(int j = 0;j<128;j++)
				hmm.setTransitionProbability(i,j,transition[i][j]);
		
		return hmm;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HiddenMarkovModel hmm = null;
		HiddenMarkovModel learntHmm = null;
		
		String whereisMidi = "./hereismidi";
		File midiFiledir = new File(whereisMidi);
		
		ReadMidi rmMidi = new ReadMidi(midiFiledir);
		
		if(rmMidi.getMidipath()!=null)
		{
			Iterator<String> i =  rmMidi.getMidipath().iterator();
			while(i.hasNext())
			{
				
			}
		}
		
		hmm = buildHMM(rmMidi.normalize_start(), rmMidi.normalize_velocity(), rmMidi.normalize_transition());
	}
}
