package com.dbs.common;
import com.audium.server.session.ActionElementData;
import com.audium.server.voiceElement.ActionElementBase;

public class Occurrence extends ActionElementBase{
	

		@Override
		public void doAction(String arg0, ActionElementData data) throws Exception {
			
			String Occurence=(String) data.getSessionData("Occurence");
			
			if(Occurence == null || Occurence.trim().equals("")){
				data.setSessionData("Occurence", "0");
				Occurence = (String) data.getSessionData("Occurence");
			}
			
			int count=Integer.parseInt(Occurence);
			 count++;
			 data.addToLog("Occurence", String.valueOf(count));
			 data.setSessionData("Occurence", String.valueOf(count));
			
		}

	

}
