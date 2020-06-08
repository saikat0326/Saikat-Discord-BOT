package R3vivalX.Main;

import javax.security.auth.login.LoginException;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;

import R3vivalX.Commands.Admin;
import R3vivalX.Commands.CICSE;
import R3vivalX.Commands.ClearChat;
import R3vivalX.Commands.Commands;
import R3vivalX.Commands.Crush;
import R3vivalX.Commands.Developer;
import R3vivalX.Commands.Diss;
import R3vivalX.Commands.Kill;
import R3vivalX.Commands.getID;
import R3vivalX.Commands.info;
import R3vivalX.Commands.multimsg;
import R3vivalX.Commands.say;
import R3vivalX.Commands.testing;
import R3vivalX.Commands.waifu;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
public class Eraser {
	
	public static JDA jda;
	public static  JDABuilder builder;
	public static final String PREFIX = "~";
	private final static String TOKEN = "NzE3NzExODU0ODYzOTA4ODY0.Xtx_DQ.BIC4eWs24Hx0j2uosTU-vzmNYqw";
	
	//Main Method
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws LoginException {
		
		builder = new JDABuilder().setToken(TOKEN);
		 jda = new JDABuilder(AccountType.BOT).setToken(TOKEN).build();
		builder.setActivity(Activity.of(Activity.ActivityType.WATCHING, "Beautiful Morning At Sea Beach")).build();
		
		jda.addEventListener(new Crush());
		jda.addEventListener(new say());
		jda.addEventListener(new info());
		jda.addEventListener(new ClearChat());
		jda.addEventListener(new Developer());
		jda.addEventListener(new Admin());
		jda.addEventListener(new Diss());
		jda.addEventListener(new waifu());
		jda.addEventListener(new Commands());
		jda.addEventListener(new BasicAbility());
		jda.addEventListener(new Kill());
		jda.addEventListener(new getID());
		jda.addEventListener(new testing());
		jda.addEventListener(new CICSE());
		
		//for(int i = 0 ; i < 100 ; i++)
		//jda.addEventListener(new multimsg());
		
		

	}
	
}
