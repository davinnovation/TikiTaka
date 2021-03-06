/*
 *  Markov Composer 0.2.4
 * 
 *  Copyright (C) 2015 - Andrej Budinčević
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.

 *  You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.davinnovation.encong.MarkovChain;

import java.util.HashMap;

public class Vertex {
	public HashMap<Integer, Edge> edges;
	public int key;
	
	public Vertex(int key) {
		this.key = key;
		
		edges = new HashMap<Integer, Edge>();
	}
	
	public HashMap<Integer, Edge> getEdges() {
		return edges;
	}
	
	public int getKey() {
		return key;
	}
}
