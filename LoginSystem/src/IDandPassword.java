//hash map

import java.util.HashMap;

public class IDandPassword {
	HashMap<String,String> loginInfo=new HashMap<String,String>();

	IDandPassword(){
		loginInfo.put("zain","putaBonjour");
		loginInfo.put("ahmed","messi123");
		loginInfo.put("jay","jayZblueprint");
	}
	protected HashMap getLoginInfo(){
		return loginInfo;
		
	}
}
