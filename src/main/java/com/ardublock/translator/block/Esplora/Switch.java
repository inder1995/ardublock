package com.ardublock.translator.block.Esplora;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;


public class Switch extends TranslatorBlock {

	public Switch (Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
	//@Override
			public String toCode() throws SocketNullException, SubroutineNotDeclaredException
			{
				
				String Switch;
				TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
				Switch = translatorBlock.toCode();
				translator.addHeaderFile("Esplora.h");
				String ret = "!Esplora.readButton(SWITCH_"+Switch+")";
				
				return codePrefix + ret + codeSuffix;
					
			}
	
}
