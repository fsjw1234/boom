package net.fand.cheer.demo.ch16;

import java.lang.reflect.Modifier;

public class ModifierTest {

	public static void main(String[] args) {
		int mod=0x11; //17
		System.out.println(Modifier.toString(mod));
		
		int mod1=0x19; //25
		System.out.println(Modifier.toString(mod1));
	}
}